package com.samuelvazquez.sqlinjections;

import java.sql.*;

public class DBConnection {
    public final static String DB_URL = "jdbc:mysql://localhost/learningdb";
    public final static String DB_USERNAME = "root";
    public final static String DB_PASSWORD = "root";

    private Connection connection;

    public boolean open() {
        try {
            connection = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
            return true;
        } catch (SQLException e) {
            System.out.println("Couldn't connect to database: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public void close() {
        try {
            if(connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println("Couldn't close connection: " + e.getMessage());
        }
    }

    public void printUserData(String id, String pwd) throws NullPointerException, SQLException {
        Statement stmt;
        ResultSet rs;
        DBConnection dbConnection = new DBConnection();

        try {
            dbConnection.open();
            stmt = connection.createStatement();
            String query = "select name, country, password from users where email='"+id+"' and password='"+pwd+"'";
            System.out.println(query);
            rs = stmt.executeQuery(query);
            while(rs.next()) {
                System.out.println("Name="+rs.getString("name")+",country="+rs.getString("country")+",password="+rs.getString("password"));
            }
            rs.close();
            stmt.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
