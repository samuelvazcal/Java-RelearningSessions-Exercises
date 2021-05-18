package com.samuelvazquez.firstexample;

import java.sql.*;

public class PokemonJDBC {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pokemondb","root","root");
            Statement statement = connection.createStatement();
            //ResultSet resultSet = statement.executeQuery("SELECT * FROM pokemon");
            statement.execute("CREATE TABLE favpokemon (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(16))");
            statement.close();
            connection.close();
        } catch(SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
