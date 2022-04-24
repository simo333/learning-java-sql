package pl.mysql.jointable;

public class Main03 {
    public static void main(String[] args) {
        String queryProductsWithOpinions = "SELECT * FROM products p JOIN opinions o ON p.id = o.product_id";
        String queryProductsAndOpinions = "SELECT * FROM products p LEFT JOIN opinions o ON p.id = o.product_id";
        String queryOpinionByProductId = "SELECT * FROM opinions o JOIN products p ON o.product_id = p.id WHERE p.id = 1";
    }

}
