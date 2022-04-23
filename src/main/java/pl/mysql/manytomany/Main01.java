package pl.mysql.manytomany;

public class Main01 {
    public static void main(String[] args) {
        String queryCreateTable = "create table products_orders (\n" +
                "    product_id INT UNSIGNED NOT NULL,\n" +
                "    order_id  INT UNSIGNED NOT NULL,\n" +
                "    FOREIGN KEY (product_id) REFERENCES products(id),\n" +
                "    FOREIGN KEY (order_id) REFERENCES orders(id)\n" +
                ");";

        String queryInsertIntoOrders = "INSERT INTO orders(description) VALUES ('Order 1'), ('Order 2')";
        String queryInsertIntoProducts = "INSERT INTO products(name, description, price) VALUES ('Sok', 'Super sok', 13)";
        String queryInsertIntoOP = "INSERT INTO products_orders VALUES (1,2), (3,2);";

        String queryJoin = "SELECT * FROM products p\n" +
                "    join products_orders po on p.id = po.product_id\n" +
                "    join opinions o on p.id = o.product_id";
    }
}
