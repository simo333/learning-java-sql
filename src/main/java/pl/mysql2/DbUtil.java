package pl.mysql2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
    public static final String DB_URL_EXAM2 = "jdbc:mysql://localhost:3306/exam2";
    public static final String DB_USER = "root";
    public static final String DB_PASS = "root";

    public static Connection connect(String url) throws SQLException {
        return DriverManager.getConnection(url, DB_USER, DB_PASS);
    }
}
