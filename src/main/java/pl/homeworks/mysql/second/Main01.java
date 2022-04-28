package pl.homeworks.mysql.second;

public class Main01 {
       public String query1 = "UPDATE offers SET price = price + 1000 WHERE id BETWEEN 20 AND 25";

       public String query2 = "DELETE FROM offers WHERE DATEDIFF(NOW(), expire) >= 3";

       public String query3 = "DELETE FROM offers WHERE phone LIKE '+48%' AND promoted = 1 AND DATEDIFF(expire, NOW()) > 0";

       public String query4 = "UPDATE offers SET promoted = 1, promoted_to = DATE_ADD(promoted_to, INTERVAL 23 DAY) WHERE SUBSTRING(phone FROM 3 FOR 2) = '48'";

       public String query5 = "UPDATE offers SET description = REPLACE(description, 'executed', 'found') WHERE phone LIKE '%(%)%' AND price > 400000";

}
