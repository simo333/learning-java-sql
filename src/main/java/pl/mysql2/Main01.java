package pl.mysql2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main01 {

    private static final String QUERY1 = "CREATE TABLE users (" +
            "    id INT AUTO_INCREMENT PRIMARY KEY," +
            "    name VARCHAR(60)," +
            "    email VARCHAR(60) UNIQUE," +
            "    password VARCHAR(60)" +
            ");";
    private static final String QUERY2 = "CREATE TABLE messages (" +
            "    id INT AUTO_INCREMENT PRIMARY KEY," +
            "    user_id INT," +
            "    message TEXT," +
            "    FOREIGN KEY (user_id) REFERENCES users(id)" +
            ");";
    private static final String QUERY3 = "CREATE TABLE items (" +
            "    id INT AUTO_INCREMENT PRIMARY KEY," +
            "    name VARCHAR(40)," +
            "    description TEXT," +
            "    price DECIMAL(7,2)" +
            ");";
    private static final String QUERY4 = "CREATE TABLE orders (" +
            "    id INT AUTO_INCREMENT PRIMARY KEY," +
            "    description TEXT," +
            "    created DATETIME," +
            "    user_id INT," +
            "    FOREIGN KEY (user_id) REFERENCES users(id)" +
            ");";
    private static final String QUERY5 = "CREATE TABLE items_orders (" +
            "    item_id INT," +
            "    order_id INT," +
            "    FOREIGN KEY (item_id) REFERENCES items(id)," +
            "    FOREIGN KEY (order_id) REFERENCES orders(id)" +
            ");";

    public static void main(String[] args) {
        try (Connection conn = DbUtil.connect(DbUtil.DB_URL_EXAM2);
             PreparedStatement statement1 = conn.prepareStatement(QUERY1);
             PreparedStatement statement2 = conn.prepareStatement(QUERY2);
             PreparedStatement statement3 = conn.prepareStatement(QUERY3);
             PreparedStatement statement4 = conn.prepareStatement(QUERY4);
             PreparedStatement statement5 = conn.prepareStatement(QUERY5)) {
            statement1.executeUpdate();
            statement2.executeUpdate();
            statement3.executeUpdate();
            statement4.executeUpdate();
            statement5.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
