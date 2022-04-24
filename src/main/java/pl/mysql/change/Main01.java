package pl.mysql.change;

public class Main01 {
    public static void main(String[] args) {
        String queryPriceUSD = "alter table tickets ADD  priceUSD DECIMAL(4,2)";
        String queryDirector = "alter table movies ADD director CHAR(80)";
        String queryAlterDirector = "alter table movies MODIFY COLUMN director VARCHAR(50)";
        String queryDropPriceUSD = "alter table tickets DROP COLUMN priceUSD";
    }
}
