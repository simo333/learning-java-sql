package pl.mysql.jointable;

public class Main02 {
    public static void main(String[] args) {
        String queryOrdersByProductId = "SELECT o.* FROM orders o JOIN products p ON o.id = p.id WHERE p.id = 1";
        String queryProductsByOrderId = "SELECT p.* FROM products p JOIN orders o ON p.id = o.id WHERE o.id = 1";
    }

}
