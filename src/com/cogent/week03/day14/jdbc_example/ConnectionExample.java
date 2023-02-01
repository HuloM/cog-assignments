package com.cogent.week03.day14.jdbc_example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionExample {
    public static void main(String[] args){
        Connection conn = null;

        //load the driver class
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        // establish the connection
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc_db",
                    args[0], args[1]);
            System.out.println("Connection established");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        // close connection
        } finally {
            try {
                if (conn != null)
                    conn.close();
                System.out.println("Connection closed");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
