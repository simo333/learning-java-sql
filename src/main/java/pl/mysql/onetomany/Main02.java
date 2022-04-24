package pl.mysql.onetomany;

public class Main02 {
    public static void main(String[] args) {
        String queryCreateCategory = "create table categories (\n" +
                "    id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,\n" +
                "    name VARCHAR(100) NOT NULL\n" +
                ");";

        String queryCreateSubCategory = "create table categories_sub (\n" +
                "    id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,\n" +
                "    main_id INT UNSIGNED NOT NULL,\n" +
                "    name VARCHAR(100) NOT NULL,\n" +
                "    FOREIGN KEY (main_id) REFERENCES categories(id)\n" +
                ");";
    }

}
