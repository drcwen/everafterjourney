/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package everafterjourney;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;


/**
 *
 * @author Wendel
 */
public class SQL {
    
    private final String url;
    private final String username;
    private final String password;
    private Connection connection;

    // Default constructor with default values
    public SQL() {
        this.url = "";
        this.username = "";
        this.password = "";
    }

    // Parameterized constructor
    public SQL(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    // Method to establish the connection
    public void connect() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(url, username, password);
        }
    }

    // Method to get the connection
    public Connection getConnection() {
        return connection;
    }

    // Method to close the connection
    public void close() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Using the default constructor
        SQL dbConnection = new SQL();

        try {
            dbConnection.connect();
            System.out.println("Connection established!");

            // Your database operations here

            dbConnection.close();
            System.out.println("Connection closed!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
