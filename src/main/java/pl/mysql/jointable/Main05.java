package pl.mysql.jointable;

public class Main05 {
    public static void main(String[] args) {
        String queryCinemasByMovieId = "SELECT c.* FROM cinemas_movies cm JOIN cinemas c ON cm.cinema_id = c.id WHERE cm.movie_id = 1";
        String queryMoviesByCinemaId = "SELECT m.* FROM cinemas_movies cm JOIN movies m ON cm.movie_id = m.id WHERE cm.cinema_id = 1";
    }

}
