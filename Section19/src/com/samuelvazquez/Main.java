package com.samuelvazquez;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        try {
            //1. Create connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiendita","root","root");
            //2. Create Statement instance
            Statement statement = connection.createStatement();
            //3. Execute SQL sentence
            ResultSet resultSet = statement.executeQuery("SELECT * FROM clientes");
            // 4. Read resulSet instance
            while(resultSet.next()) {
                System.out.println(resultSet.getString("idCliente") + " " + resultSet.getString("nombreCliente"));
            }
        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
