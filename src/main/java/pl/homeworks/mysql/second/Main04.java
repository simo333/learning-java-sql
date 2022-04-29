package pl.homeworks.mysql.second;

public class Main04 {
    public static void main(String[] args) {
        String queryMoviesList = "SELECT * FROM movies LEFT JOIN cinemas_ex.screenings s on movies.id = s.movie_id";
    }

}
