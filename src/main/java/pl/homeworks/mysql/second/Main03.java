package pl.homeworks.mysql.second;

public class Main03 {
    public static void main(String[] args) {
        String queryCreateTableScreenings = "CREATE TABLE screenings (\n" +
                "    id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,\n" +
                "    cinema_id INT,\n" +
                "    movie_id INT,\n" +
                "    show_time DATETIME,\n" +
                "    FOREIGN KEY (cinema_id) REFERENCES cinemas(id),\n" +
                "    FOREIGN KEY (movie_id) REFERENCES movies(id)\n" +
                ")";
    }

}
