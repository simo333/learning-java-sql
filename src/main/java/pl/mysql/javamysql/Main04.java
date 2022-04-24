package pl.mysql.javamysql;

import java.sql.Connection;
import java.sql.SQLException;

public class Main04 {
    public static void main(String[] args) {
        try (Connection conn = DbUtil.connect(DbUtil.DB_URL_CINEMAS)) {
            DbUtil.printData(conn, "SELECT * FROM movies", "title", "description", "rating");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
