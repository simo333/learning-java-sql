package pl.mysql2;

public class Main02 {

	private static final String QUERY1 = "SELECT * FROM items WHERE price > 50 ORDER BY price";
	private static final String QUERY2 = "INSERT INTO items(name, description) VALUES ('product1', 'desc')";
	private static final String QUERY3 = "DELETE FROM users WHERE id = 3";
	private static final String QUERY4 =
			"SELECT DISTINCT u.id,u.name,u.email FROM messages m LEFT JOIN users u on u.id = m.user_id ORDER BY id DESC";
	private static final String QUERY5 =
			"SELECT i.price FROM items_orders io LEFT JOIN items i on io.item_id = i.id WHERE io.order_id = 1 ORDER BY i.price DESC LIMIT 1";
	private static final String QUERY6 = "SELECT * FROM orders WHERE created LIKE '2017-11-12%'";
	private static final String QUERY7 = "INSERT INTO items_orders VALUES (2, 3)";
	private static final String QUERY8 = "SELECT * FROM messages WHERE message LIKE 'a%'";

}
