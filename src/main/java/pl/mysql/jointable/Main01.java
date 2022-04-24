package pl.mysql.jointable;

public class Main01 {
    public static void main(String[] args) {
        String queryTicketsTypeCash = "SELECT * FROM tickets t JOIN payments p ON t.id = p.id WHERE p.type = 'cash'";
        String queryTicketsNotPaid = "SELECT * FROM tickets t LEFT JOIN payments p ON t.id = p.id WHERE p.payment_date is null";

    }
}
