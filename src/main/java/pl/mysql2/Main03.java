package pl.mysql2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        String name = getStringInput("Enter name: ");
        String description = getStringInput("Enter description: ");
        double price = getDoubleInput("Enter price: ");
        insertIntoItems(name, description, price);
    }

    static void insertIntoItems(String name, String description, double price) {
        String query = "INSERT INTO items(name,description,price) VALUES (?,?,?)";
        try (Connection conn = DbUtil.connect(DbUtil.DB_URL_EXAM2);
             PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setString(1, name);
            statement.setString(2, description);
            statement.setDouble(3, price);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static double getDoubleInput(String txt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(txt);
        while (true) {
            try {
                double input = scanner.nextDouble();
                if (input < 0) {
                    throw new IllegalArgumentException();
                }
                return input;
            } catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println("Enter a positive number.");
                scanner.nextLine();
            }
        }
    }

    static String getStringInput(String txt) {
        Scanner scan = new Scanner(System.in);
        System.out.println(txt);
        return scan.nextLine();
    }

}
