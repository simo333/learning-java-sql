package pl.mysql.javamysql;

import java.sql.Connection;
import java.sql.SQLException;

public class Main02 {
    public static void main(String[] args) {
        try (Connection conn = DbUtil.connect(DbUtil.DB_URL_PRODUCTS)) {
            String insertCategories = "INSERT INTO categories(name) VALUES (?)";
            String insertSubCategories = "INSERT INTO categories_sub(main_id, name) VALUES (?, ?)";
            String insertClientAddresses = "INSERT INTO client_address VALUES (?, ?, ?, ?)";
            String insertClients = "INSERT INTO clients(name, surname) VALUES (?, ?)";
            String insertOpinions = "INSERT INTO opinions(description, product_id) VALUES (?, ?)";
            String insertOrders = "INSERT INTO orders(description) VALUES (?)";
            String insertProducts = "INSERT INTO products(name,description,price) VALUES (?, ?, ?)";
            String insertProductsOrders = "INSERT INTO products_orders(product_id,order_id) VALUES (?, ?)";

            DbUtil.insert(conn, insertCategories, "From Java 1");
            DbUtil.insert(conn, insertCategories, "From Java 2");

            DbUtil.insert(conn, insertSubCategories, "4", "Sub 1 from Java");
            DbUtil.insert(conn, insertSubCategories, "5", "Sub 2 from Java");

            DbUtil.insert(conn, insertClients, "Joanna", "Doe");
            DbUtil.insert(conn, insertClients, "Zosia", "Krupa");

            DbUtil.insert(conn, insertClientAddresses, "3", "Poznan", "Baraniaka", "5");
            DbUtil.insert(conn, insertClientAddresses, "6", "Krakow", "Kolejowa", "15");

            DbUtil.insert(conn, insertProducts, "Piwo", "Super smaczne", "4");
            DbUtil.insert(conn, insertProducts, "Marchew", "Zdrowa", "2.5");

            DbUtil.insert(conn, insertOpinions, "Polecam!", "3");
            DbUtil.insert(conn, insertOpinions, "Smaczna", "4");

            DbUtil.insert(conn, insertOrders, "Order 1 from Java");
            DbUtil.insert(conn, insertOrders, "Order 2 from Java");

            DbUtil.insert(conn, insertProductsOrders, "3", "4");
            DbUtil.insert(conn, insertProductsOrders, "4", "4");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
