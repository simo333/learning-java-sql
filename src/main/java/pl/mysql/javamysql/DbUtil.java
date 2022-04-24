package pl.mysql.javamysql;

import java.sql.*;

public class DbUtil {
    public static final String DB_URL_PRODUCTS = "jdbc:mysql://localhost:3306/products_ex";
    public static final String DB_URL_CINEMAS = "jdbc:mysql://localhost:3306/cinemas_ex";
    public static final String DB_USER = "root";
    public static final String DB_PASS = "root";
    private static final String DELETE_QUERY = "DELETE FROM tableName where id = ?";


    public static Connection connect(String url) throws SQLException {
        return DriverManager.getConnection(url, DB_USER, DB_PASS);
    }

    public static void insert(Connection conn, String query, String... params) {
        try (PreparedStatement statement = conn.prepareStatement(query)) {
            for (int i = 0; i < params.length; i++) {
                statement.setString(i + 1, params[i]);
            }
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void printData(Connection conn, String query, String... columnNames) throws SQLException {

        try (PreparedStatement statement = conn.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                for (String columnName : columnNames) {
                    System.out.print(resultSet.getString(columnName) + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static double getDouble(Connection conn, String query, String columnNames) throws SQLException {
        try (PreparedStatement statement = conn.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery();) {
            if (resultSet.next()) {
                return resultSet.getDouble(columnNames);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static void remove(Connection conn, String tableName, int id) {
        try (PreparedStatement statement =
                     conn.prepareStatement(DELETE_QUERY.replace("tableName", tableName));) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
