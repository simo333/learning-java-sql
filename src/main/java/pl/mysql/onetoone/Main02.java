package pl.mysql.onetoone;

public class Main02 {
    public static void main(String[] args) {
        String queryForeignKey = "ALTER TABLE payments ADD FOREIGN KEY(id) REFERENCES tickets(id)";
        String queryInsert = "insert into payments values (6, 'cash', curdate()),\n" +
                "                            (8, 'transfer', curdate()),\n" +
                "                            (9, 'card', '2020-04-10');";
    }
}
