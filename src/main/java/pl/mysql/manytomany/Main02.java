package pl.mysql.manytomany;

public class Main02 {
    public static void main(String[] args) {
        String queryCreateCinemasMovies = "create table cinemas_movies (\n" +
                "                                 cinema_id INT NOT NULL,\n" +
                "                                 movie_id  INT NOT NULL,\n" +
                "                                 FOREIGN KEY (cinema_id) REFERENCES cinemas(id),\n" +
                "                                 FOREIGN KEY (movie_id) REFERENCES movies(id),\n" +
                "                                 PRIMARY KEY (cinema_id, movie_id)\n" +
                ");\n";
    }



}
