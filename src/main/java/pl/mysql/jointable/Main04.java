package pl.mysql.jointable;

public class Main04 {
    public static void main(String[] args) {
        String querySubCatOfCatId = "SELECT * FROM categories_sub cs JOIN categories c ON cs.main_id = c.id WHERE c.id = 1";
        String queryCatWithSubCat = "SELECT DISTINCT c.* FROM categories c JOIN categories_sub cs ON c.id = cs.main_id";
    }

}
