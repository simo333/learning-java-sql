package pl.homeworks.mysql.first;

public class Main02 {
     public String createTableImagesQuery = "CREATE TABLE images (" +
             "  id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY, " +
             "  offer_id INT UNSIGNED, " +
             "  src VARCHAR(100), " +
             "  dimension VARCHAR(10)" +
             ")";

     public String createTableUsersCompaniesQuery = "CREATE TABLE users_companies (" +
             "    id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY, " +
             "    user_id INT UNSIGNED UNIQUE, " +
             "    name VARCHAR(30), " +
             "    nip INT, " +
             "    street VARCHAR(50), " +
             "    street_nr MEDIUMINT, " +
             "    phone CHAR(9), " +
             "    post_code CHAR(6), " +
             "    capital DECIMAL(7,2), " +
             "    rate DECIMAL(5,4), " +
             "    created_at DATETIME" +
             ")";

}
