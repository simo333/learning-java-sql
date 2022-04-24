package pl.mysql.javamysql;

import java.sql.Connection;
import java.sql.SQLException;

public class Main06 {
//    public static void main(String[] args) {
//        String query = "SELECT * FROM movies WHERE movies.rating > (SELECT AVG(rating) FROM movies)";
//        try (Connection conn = DbUtil.connect(DbUtil.DB_URL_CINEMAS)) {
//            DbUtil.printData(conn, query, "title", "rating");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) {
        try (Connection conn = DbUtil.connect(DbUtil.DB_URL_CINEMAS)) {
            double x = DbUtil.getDouble(conn, "select AVG(rating) as average from movies", "average");
            DbUtil.printData(conn, "select * from movies m where rating >" + x, "id", "title", "rating");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
