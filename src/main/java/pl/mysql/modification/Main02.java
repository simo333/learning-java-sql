package pl.mysql.modification;

public class Main02 {
    public static void main(String[] args) {
        String queryTicketsQuantity = "SELECT SUM(quantity) AS tickets_quantity FROM tickets";
        String queryGroupPayments = "SELECT type, COUNT(*) AS payments_number FROM payments GROUP BY type";
        String queryAveragePrice = "SELECT AVG(price) AS average_price FROM tickets";
        String queryLastPayments = "SELECT * FROM payments ORDER BY payment_date DESC LIMIT 5 OFFSET 1;";
        String queryPaymentsByTypeGreaterThan2 = "SELECT * FROM payments GROUP BY type HAVING COUNT(*) > 2";
        String queryQuantity = "SELECT SUM(quantity) FROM tickets WHERE price > 23.15;";
    }

}
