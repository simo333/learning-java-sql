package pl.homeworks.mysql.second;

import pl.mysql.javamysql.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main07 {
    public static void main(String[] args) {
        getMoviesByCinemaName(getCinemaName());
    }

    static String getCinemaName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź nazwę kina:");
        return scan.nextLine();
    }

    static void getMoviesByCinemaName(String title) {
        String queryGetCinema = "SELECT id FROM cinemas WHERE name LIKE ?";
        String queryGetCinemaMovies = "SELECT movie_id FROM cinemas_movies WHERE cinema_id LIKE ?";

        try (Connection conn = DbUtil.connect(DbUtil.DB_URL_CINEMAS);
             PreparedStatement statement = conn.prepareStatement(queryGetCinema);
             PreparedStatement statement2 = conn.prepareStatement(queryGetCinemaMovies)) {
            statement.setString(1, title + "%");
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    int cinemaId = resultSet.getInt("id");
                    System.out.println("Wyszukane kino o id " + cinemaId + ":");
                    statement2.setInt(1, cinemaId);
                    try (ResultSet resultSet2 = statement2.executeQuery()) {
                        while (resultSet2.next()) {
                            System.out.println("* Film o id " + resultSet2.getInt("movie_id"));
                        }
                    }
                    return;
                }
                System.out.println("Nie odnaleziono kina o podanej nazwie.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
