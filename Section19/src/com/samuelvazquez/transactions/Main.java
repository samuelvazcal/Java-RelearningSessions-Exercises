package com.samuelvazquez.transactions;

import java.sql.*;

public class Main {
    public static final String DB_NAME = "learningdb";
    public static final String DB_URL = "jdbc:mysql://localhost/" + DB_NAME;
    public static final String USER_NAME = "root";
    public static final String USER_PASSWORD = "root";
    public static void main(String[] args) throws SQLException {
        String query = "INSERT INTO employees VALUES (?,?,?)";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL,USER_NAME,USER_PASSWORD);
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            Statement statement = connection.createStatement();
            preparedStatement.setInt(1,104);
            preparedStatement.setString(2,"Paulina");
            preparedStatement.setInt(3,21000);
            preparedStatement.executeUpdate();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employees");

            //next line it is a malformed SQL statement that will break the transaction
            //ResultSet resultSet = statement.executeQuery("SELECT * FROM employeesX");

            while(resultSet.next()) {
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
            }
            //if there is not error
            connection.commit();

            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
            connection.rollback();

        }
    }
}
