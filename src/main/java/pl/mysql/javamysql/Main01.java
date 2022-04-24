package pl.mysql.javamysql;

import java.sql.Connection;
import java.sql.SQLException;

public class Main01 {
    public static void main(String[] args) {
        try (Connection conn = DbUtil.connect(DbUtil.DB_URL_PRODUCTS)) {
            System.out.println("Udalo sie!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
