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
        PreparedStatement ps;
        String query = "SELECT name, country, password FROM users WHERE email = ? AND password = ?";
        DBConnection dbConnection = new DBConnection();

        try {
            dbConnection.open();
            //stmt = connection.createStatement();
            //now using PreparedStatement
            ps = connection.prepareStatement(query);
            //SQL injection: samuel@apple.com' or '1'='1
            //String query = "select name, country, password from users where email='"+id+"' and password='"+pwd+"'";
            //System.out.println(query);
            //rs = stmt.executeQuery(query);

            //setting parameters
            ps.setString(1,id);
            ps.setString(2,pwd);
            rs = ps.executeQuery();
            while(rs.next()) {
                System.out.println("Name="+rs.getString("name")+",country="+rs.getString("country")+",password="+rs.getString("password"));
            }
            rs.close();
            //stmt.close();
            ps.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
