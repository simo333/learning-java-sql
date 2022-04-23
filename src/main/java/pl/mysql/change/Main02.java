package pl.mysql.change;

public class Main02 {
    public static void main(String[] args) {
        String queryWatchCount = "alter table movies ADD watchCount INT UNSIGNED DEFAULT 0";
        String queryIsTop = "alter table movies ADD isTop TINYINT DEFAULT 0";
        String queryOpen = "alter table cinemas ADD openTime TIMESTAMP NOT NULL;";
        String queryClose = "alter table cinemas ADD closeTime TIMESTAMP NOT NULL;";
    }
}
