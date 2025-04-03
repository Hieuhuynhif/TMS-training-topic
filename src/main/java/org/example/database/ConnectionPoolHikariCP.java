package org.example.database;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.*;

public class ConnectionPoolHikariCP {

    private static final HikariDataSource dataSource;

    static {
        // Configure HikariCP
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:h2:mem:testdb"); // H2 in-memory database
        config.setUsername("sa"); // Default H2 username
        config.setPassword(""); // Default H2 password (empty)

        // HikariCP Settings
        config.setMaximumPoolSize(10);
        config.setMinimumIdle(2);
        config.setIdleTimeout(30000);
        config.setConnectionTimeout(20000);
        config.setMaxLifetime(1800000);

        // Initialize the connection pool
        dataSource = new HikariDataSource(config);
    }

    public static void main(String[] args) {
        try {
            Connection connection = dataSource.getConnection();
            Statement stmt = connection.createStatement();
            // Create a table
            stmt.execute("CREATE TABLE users (id INT PRIMARY KEY, username VARCHAR(50))");
            stmt.execute("INSERT INTO users VALUES (1, 'admin'), (2, 'user1')");

            // Query the table
            String sql = "SELECT * FROM users";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                System.out.println("User: " + rs.getString("username"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dataSource.close(); // Close pool on shutdown
        }
    }
}
