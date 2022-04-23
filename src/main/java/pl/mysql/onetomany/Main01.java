package pl.mysql.onetomany;

public class Main01 {
    public static void main(String[] args) {
        String queryOpinions = "create table opinions (\n" +
                "    id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,\n" +
                "    description VARCHAR(1000) NOT NULL,\n" +
                "    product_id INT UNSIGNED NOT NULL,\n" +
                "    FOREIGN KEY (product_id) REFERENCES products(id) ON DELETE CASCADE \n" +
                ");";

        String queryInsertIntoProducts = "insert into products (name, description, price) VALUES ('Jaja', 'Super jaja z wolnego wybiegu', 7)";
        String queryInsertIntoOpinions = "insert into opinions (description, product_id) VALUES ('Sciema - zwykle jaja', 1),\n" +
                "                                                      ('Super jaja, polecam', 1),\n" +
                "                                                      ('Nigdy lepszych nie jadlem', 1);";
    }
}
