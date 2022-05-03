package pl.mysql2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        System.out.println("Enter id: ");
        int userId = getIntInput();
        getAllMessagesByUserId(userId);
        getAllOrdersByUserId(userId);
    }

    static int getIntInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                int input = scanner.nextInt();
                if (input < 1) {
                    throw new IllegalArgumentException();
                }
                return input;
            } catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println("Enter a positive integer.");
                scanner.nextLine();
            }
        }
    }

    static void getAllMessagesByUserId(int id) {
        String query = "SELECT message FROM messages WHERE user_id = ?";
        try (Connection conn = DbUtil.connect(DbUtil.DB_URL_EXAM2);
             PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    System.out.println(resultSet.getString("message"));
                }
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void getAllOrdersByUserId(int id) {
        String query = "SELECT description, created FROM orders WHERE user_id = ?";
        try (Connection conn = DbUtil.connect(DbUtil.DB_URL_EXAM2);
             PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    System.out.print(resultSet.getString("description") + " | ");
                    System.out.println(resultSet.getString("created"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
