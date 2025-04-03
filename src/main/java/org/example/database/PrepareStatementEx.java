package org.example.database;

import java.sql.*;

public class PrepareStatementEx {

    public static void main(String[] args) {
        String url = "jdbc:h2:mem:testdb"; // In-memory database
        String user = "sa";
        String password = "";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database");

            Statement stm = conn.createStatement();
            String StmSql = "CREATE TABLE users (id INT PRIMARY KEY, name VARCHAR(100))";
            stm.execute(StmSql);
            System.out.println("Table created");

//            PreparedStatement

            String preSql = "INSERT INTO users (name, id) VALUES (?, ?)";
            PreparedStatement preStmt = conn.prepareStatement(preSql);
            preStmt.setString(1, "John");
            preStmt.setInt(2, 1);
            preStmt.execute();

            System.out.println("Insert successful");


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
