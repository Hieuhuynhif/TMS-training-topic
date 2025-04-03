package org.example.database;

import java.sql.*;


public class CallableStatementEx {

    private static final String url = "jdbc:h2:mem:testdb"; // H2 database URL (in-memory)
    private static final String user = "sa"; // Default H2 username
    private static final String password = ""; // Default H2 password

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database");

            Statement stm = conn.createStatement();
            String StmSql = "CREATE TABLE users (id INT PRIMARY KEY, name VARCHAR(100))";
            stm.execute(StmSql);
            System.out.println("Table created");


            String preSql = "INSERT INTO users (name, id) VALUES (?, ?)";
            PreparedStatement preStmt = conn.prepareStatement(preSql);
            preStmt.setString(1, "John");
            preStmt.setInt(2, 1);
            preStmt.execute();

            System.out.println("Insert successful");

            String createGetUserByIdSQL =
                    "CREATE ALIAS GET_USER_BY_ID FOR " +
                            "'org.example.database.CallableStatementEx.getUserById'";

            stm.execute(createGetUserByIdSQL);
            System.out.println("Create produce GET_USER_BY_ID successful");

            stm.close();
            preStmt.close();

            String callableSQL = "{call GET_USER_BY_ID(?)}";
            CallableStatement cstm = conn.prepareCall(callableSQL);
            cstm.registerOutParameter(1, Types.VARCHAR);

//            CallableStatement
            cstm.setInt(1, 1);
            cstm.execute();

            String userName = cstm.getString(1);
            System.out.println("Get user by user name: " + userName);


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static String getUserById(int userId) throws SQLException {

        String name = null;

        Connection conn = DriverManager.getConnection(url, user, password);
        PreparedStatement pstmt = conn.prepareStatement("SELECT name FROM users WHERE id = ?");
        pstmt.setInt(1, userId);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            name = rs.getString("name");
        }

        return name;
    }
}
