package org.example.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementEx {

    public static void main(String[] args) {
        String url = "jdbc:h2:mem:testdb"; // In-memory database
        String user = "sa";
        String password = "";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database");

            Statement stm = conn.createStatement();
            String sql = "CREATE TABLE users (id INT PRIMARY KEY, name VARCHAR(100))";
            stm.execute(sql);
            System.out.println("Table created");


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
