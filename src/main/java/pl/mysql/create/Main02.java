package pl.mysql.create;

public class Main02 {

    public static void main(String[] args) {
        String queryProducts = "create table products (" +
                "  id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT, " +
                "  name VARCHAR(100) NOT NULL, " +
                "  description VARCHAR(1000), " +
                "  price DECIMAL(6,2) NOT NULL" +
                ")";

        String queryOrders = "create table orders (" +
                "  id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT, " +
                "  description VARCHAR(1000)" +
                ")";

        String queryClients = "create table clients (" +
                "    id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT, " +
                "    name VARCHAR(100) NOT NULL, " +
                "    surname VARCHAR(100) NOT NULL" +
                ")";
    }
}
