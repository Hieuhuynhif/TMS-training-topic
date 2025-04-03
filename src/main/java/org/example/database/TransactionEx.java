package org.example.database;

import java.sql.*;

public class TransactionEx {

    public static void main(String[] args) {

        final String url = "jdbc:h2:mem:testdb"; // H2 in-memory database
        final String user = "sa"; // Default username
        final String password = ""; // Default password

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            System.out.println("Connected to database");

            // Create Table
            stmt.execute("CREATE TABLE accounts (id INT PRIMARY KEY, name VARCHAR(100), balance INT)");
            System.out.println("Table created");

            //  Insert Initial Data
            stmt.execute("INSERT INTO accounts (id, name, balance) VALUES (1, 'Alice', 1000), (2, 'Bob', 500)");
            System.out.println("Initial balances inserted");


            //  Start Transaction (Disable Auto-Commit)
            conn.setAutoCommit(false);
            System.out.println("Transaction started");
//transfer balance from Alice to Bob
            try {
                PreparedStatement subtractStmt = conn.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
                PreparedStatement addStmt = conn.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?");

                // Subtract money from Alice (Sender)
                subtractStmt.setInt(1, 200);
                subtractStmt.setInt(2, 1);
                subtractStmt.executeUpdate();

                // Add money to Bob (Receiver)
                addStmt.setInt(1, 200);
                addStmt.setInt(2, 2);
                addStmt.executeUpdate();

                // Commit Transaction
                conn.commit();
                System.out.println("Transaction committed ");

            } catch (SQLException e) {
                // Rollback if Error
                conn.rollback();
                System.out.println("Transaction rolled back ");
                e.printStackTrace();
            }

            // Check Updated Balances
            ResultSet rs = stmt.executeQuery("SELECT * FROM accounts");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Balance: " + rs.getInt("balance"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
