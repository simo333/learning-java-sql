package pl.mysql.create;

public class Main04 {

    public static void main(String[] args) {
        String queryCinemas = "create table cinemas (" +
                "     id int unsigned primary key auto_increment, " +
                "     name varchar(100) not null, " +
                "     address varchar(200) not null" +
                ")";

        String queryMovies = "create table movies (" +
                "    id INT PRIMARY KEY AUTO_INCREMENT, " +
                "    title VARCHAR(100) NOT NULL, " +
                "    description VARCHAR(1000) NOT NULL, " +
                "    rating DECIMAL(4,2)" +
                ")";

        String queryTickets = "create table tickets (" +
                "    id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT, " +
                "    quantity INT UNSIGNED NOT NULL, " +
                "    price DECIMAL(4, 2) NOT NULL, " +
                "    status INT NOT NULL" +
                ")";

        String queryPayments = "create table payments (" +
                "    id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT, " +
                "    type CHAR(10) NOT NULL, " +
                "    payment_date DATE NOT NULL" +
                ")";
    }
}
