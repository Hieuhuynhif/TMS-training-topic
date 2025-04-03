package org.example.database;

import java.sql.*;

public class ResultSetEx {
    public static void main(String[] args) {
        final String url = "jdbc:h2:mem:testdb"; // H2 in-memory database
        final String user = "sa"; // Default username
        final String password = ""; // Default password

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            System.out.println("Connected to database");

            // 1Create Table
            String createTableSQL = "CREATE TABLE users (id INT PRIMARY KEY, name VARCHAR(100))";
            stmt.execute(createTableSQL);
            System.out.println("Table created");

            //  Insert Data
            String insertSQL = "INSERT INTO users (id, name) VALUES (1, 'John'), (2, 'Alice'), (3, 'Bob')";
            stmt.execute(insertSQL);
            System.out.println("Data inserted");

            //  Execute Query & Get ResultSet
            String selectSQL = "SELECT * FROM users";
            ResultSet rs = stmt.executeQuery(selectSQL);

            // Process ResultSet
            System.out.println("Users in database:");
            while (rs.next()) {
                int id = rs.getInt("id");       // Get ID
                String name = rs.getString("name"); // Get Name
                System.out.println("ID: " + id + ", Name: " + name);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
