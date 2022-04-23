package pl.mysql.modification;

public class Main03 {
    public static void main(String[] args) {
        String queryTitleWithW = "SELECT * FROM movies WHERE title LIKE 'W%'";
        String queryTicketsPrice = "SELECT * FROM tickets WHERE price > 15.30";
        String queryTicketsQuantity = "SELECT * FROM tickets WHERE quantity > 3";
        String queryMoviesRating = "SELECT * FROM movies WHERE rating > 6.5";
        String queryMovieTopRating = "SELECT * FROM movies ORDER BY rating DESC LIMIT 1";
    }

}
