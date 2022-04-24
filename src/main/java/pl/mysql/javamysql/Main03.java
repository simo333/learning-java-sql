package pl.mysql.javamysql;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cinema name:");
        String name = scanner.nextLine();
        System.out.println("Enter cinema address:");
        String address = scanner.nextLine();
        addCinema(name, address);
    }

    static void addCinema(String name, String address) {
        try (Connection conn = DbUtil.connect(DbUtil.DB_URL_CINEMAS)) {
            String stmt = "INSERT INTO cinemas(name,address) VALUES (?, ?)";
            DbUtil.insert(conn, stmt, name, address);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
