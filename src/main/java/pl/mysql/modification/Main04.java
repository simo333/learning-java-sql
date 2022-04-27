package pl.mysql.modification;

public class Main04 {
    public static void main(String[] args) {
        String queryChangeName = "UPDATE cinemas SET address = 'Stadion Narodowy' WHERE name LIKE '%z'";
        String queryDeletePay = "DELETE FROM payments WHERE DATEDIFF(CURRENT_DATE, payment_date) > 4";
        String queryChangeRating = "UPDATE movies SET rating = 5.4 WHERE LENGTH(description) > 40";
        String queryLowerTicketPrice = "UPDATE tickets SET price = price * 0.5 WHERE quantity > 10";
    }
}
