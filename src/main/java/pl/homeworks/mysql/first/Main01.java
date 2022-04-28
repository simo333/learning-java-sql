package pl.homeworks.mysql.first;

public class Main01 {
    public String query1 = "SELECT * FROM users WHERE name LIKE 'Julia %'";

    public String query2 = "SELECT * FROM users ORDER BY email DESC LIMIT 5";

    public String query3 = "SELECT * FROM users WHERE email LIKE '%@yahoo.com' AND name LIKE 'L%'";

    public String query4 = "SELECT * FROM users WHERE password LIKE SHA2(name + salt, 256)";

    public String query5 = "SELECT id, title FROM offers WHERE price > 500000";

    public String query6 = "SELECT id, price FROM offers WHERE activation_token NOT LIKE ''"; //IS NOT NULL not working

    public String query7 = "SELECT title, price, phone FROM offers WHERE DATEDIFF(expire, CURRENT_TIMESTAMP) < 10 AND DATEDIFF(expire, CURRENT_TIMESTAMP) > 0";

    public String query8 = "SELECT * FROM offers WHERE description LIKE '%violent%' AND phone LIKE '%2%' AND price > 50000";

    public String query9 = "SELECT * FROM offers WHERE promoted = 1 AND price < 300000 AND title LIKE '%PLC'";

    public String query10 = "SELECT * FROM offers WHERE price * 2 < 50000 AND DATEDIFF(promoted_to, CURRENT_DATE) > 0";

    public String query11 = "SELECT COUNT(*) AS sum_active FROM offers WHERE DATEDIFF(expire, CURRENT_TIMESTAMP) > 0";

}
