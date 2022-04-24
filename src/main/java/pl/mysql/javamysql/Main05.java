package pl.mysql.javamysql;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id;
        while (true) {
            try {
                System.out.println("Enter movie's id for deletion:");
                id = scanner.nextInt();
                if (id <= 0) {
                    throw new IllegalArgumentException("Index must be greater than 0");
                }
                break;
            } catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println("Incorrect value entered. Index must be an integer greater than 0.");
                scanner.nextLine();
            }
        }

        try (Connection conn = DbUtil.connect(DbUtil.DB_URL_CINEMAS)) {
            DbUtil.remove(conn, "movies", id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
