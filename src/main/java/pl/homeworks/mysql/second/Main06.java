package pl.homeworks.mysql.second;

import pl.mysql.javamysql.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main06 {
    static String getTitle() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź tytuł filmu:");
        return scan.nextLine();
    }
//TODO fix the method
    static void getMovieByTitle(String title) {
        String query = "SELECT title, description, rating FROM movies WHERE title LIKE ?";
        try (Connection conn = DbUtil.connect(DbUtil.DB_URL_CINEMAS);
             PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setString(1, title + "%");
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    System.out.println("Wyszukany film: " + resultSet.getString("title"));
                    System.out.println("Opis: " + resultSet.getString("description"));
                    System.out.println("Ocena: " + resultSet.getDouble("rating"));
                }
            }
        } catch (SQLException e) {
            System.out.println("Nie odnaleziono filmu.");
        }
    }

    public static void main(String[] args) {
        getMovieByTitle(getTitle());
    }


}
