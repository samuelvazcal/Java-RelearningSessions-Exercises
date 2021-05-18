package com.samuelvazquez.firstexample;

import java.sql.*;

public class PokemonJDBC {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pokemondb","root","root");
            // connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            //ResultSet resultSet = statement.executeQuery("SELECT * FROM pokemon");
            statement.execute("CREATE TABLE IF NOT EXISTS favpokemon (id INT, name VARCHAR(16))");
//            statement.execute("INSERT INTO favpokemon (id, name)" +
//                                "VALUES (25,'Pikachu')," +
//                                "(16,'Pidgey')," + "(60, 'Poliwag')");
//            statement.execute("INSERT INTO favpokemon (id, name) VALUES(43,'Oddish')");
//            statement.execute("INSERT INTO favpokemon (id, name) VALUES(27,'Sandshrew')");
//            statement.execute("INSERT INTO favpokemon (id, name) VALUES(7,'Squirtle')");
//            statement.execute("INSERT INTO favpokemon (id, name) VALUES(132,'Weedle')");
//            statement.execute("UPDATE favpokemon SET id = 13 WHERE id = 132");
//            statement.execute("DELETE FROM favpokemon WHERE id = 13");
            statement.execute("SELECT * FROM favpokemon");
            ResultSet resultSet = statement.getResultSet();
            while(resultSet.next()) {
                System.out.println(resultSet.getString("id") + " " + resultSet.getString("name"));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch(SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
