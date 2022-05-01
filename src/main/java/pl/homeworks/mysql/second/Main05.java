package pl.homeworks.mysql.second;

public class Main05 {
    public static void main(String[] args) {
        String queryAllCinemas = "SELECT * FROM cinemas";
        String queryAllMoviesByCinemaId =
                "SELECT movies.* FROM movies LEFT JOIN cinemas_movies cm ON movies.id = cm.movie_id WHERE cinema_id = ?";
        String queryAllScreenings =
                "SELECT screenings.* FROM screenings LEFT JOIN cinemas c on screenings.cinema_id = c.id";

    }
}
