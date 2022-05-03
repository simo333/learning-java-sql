package pl.homeworks.mysql.second;

import pl.mysql.javamysql.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main08 {

    public static void main(String[] args) {
        getAllCinemas();
        System.out.print("Wyszukaj wszystkie filmy w kinie o id: ");
        int inputCinemaId = getIntInput();
        getMoviesByCinemaId(inputCinemaId);
        System.out.print("Wyszukaj seanse w wybranym kinie dla filmu o id: ");
        int inputMovieId = getIntInput();
        getScreeningsByCinemaIdAndMovieId(inputCinemaId, inputMovieId);

    }

    static void getAllCinemas() {
        String query = "SELECT * FROM cinemas";
        try (Connection conn = DbUtil.connect(DbUtil.DB_URL_CINEMAS);
             PreparedStatement statement = conn.prepareStatement(query)) {
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt("id") + ". " + resultSet.getString("name")
                            + " -> " + resultSet.getString("address"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static int getIntInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                int input = scanner.nextInt();
                if (input < 1) {
                    throw new IllegalArgumentException();
                }
                return input;
            } catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println("Wprowadź dodatnią liczbę całkowitą.");
                scanner.nextLine();
            }
        }
    }

    static void getMoviesByCinemaId(int id) {
        String queryGetCinemaMovies =
                "SELECT m.* FROM cinemas_movies cm LEFT JOIN movies m ON cm.movie_id = m.id WHERE cinema_id LIKE ?";
        try (Connection conn = DbUtil.connect(DbUtil.DB_URL_CINEMAS);
             PreparedStatement statement = conn.prepareStatement(queryGetCinemaMovies)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt("id") + ". "
                            + resultSet.getString("title")
                            + " { Rating: [" + resultSet.getDouble("rating") + "] } "
                            + " -> " + resultSet.getString("description"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void getScreeningsByCinemaIdAndMovieId(int inputCinemaId, int inputMovieId) {
        String query = "SELECT show_time FROM screenings WHERE cinema_id = ? AND movie_id = ?";
        try (Connection conn = DbUtil.connect(DbUtil.DB_URL_CINEMAS);
             PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setInt(1, inputCinemaId);
            statement.setInt(2, inputMovieId);
            try (ResultSet resultSet = statement.executeQuery()) {
                System.out.println("Znalezione seanse:");
                while (resultSet.next()) {
                    System.out.println(resultSet.getString("show_time"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
