package com.samuelvazquez.firstexample;

import java.sql.*;

public class PokemonJDBC2 {
    public static final String DB_NAME = "pokemondb";
    public static final String CONNECTION_STRING = "jdbc:mysql://localhost/" + DB_NAME;
    public static final String USER_NAME = "root";
    public static final String USER_PASSWORD = "root";
    public static final String TABLE_FAVPOKEMON = "favpokemon";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NAME = "name";


    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(CONNECTION_STRING,USER_NAME,USER_PASSWORD);
            Statement statement = connection.createStatement();
            statement.execute("DROP TABLE IF EXISTS " + TABLE_FAVPOKEMON);
            statement.execute("CREATE TABLE IF NOT EXISTS " +  TABLE_FAVPOKEMON + "(" + COLUMN_ID + " INT," +  COLUMN_NAME + " VARCHAR(16))");
//            statement.execute("INSERT INTO " + TABLE_FAVPOKEMON + " (" + COLUMN_ID + ", " + COLUMN_NAME + ")" +
//                    "VALUES (25,'Pikachu')," + "(16,'Pidgey')," + "(58, 'Growlithe')");
            insertPokemon(statement,7,"Squirtle");
            insertPokemon(statement,25,"Pikachu");
            insertPokemon(statement,27,"Sandshrew");
            insertPokemon(statement,58,"Growlithe");
            insertPokemon(statement,16,"Pidgey");
            insertPokemon(statement,43,"Oddish");
            statement.execute("UPDATE " + TABLE_FAVPOKEMON + " SET " + COLUMN_ID + " = 13" + " WHERE " + COLUMN_ID +
                    "=132");
            statement.execute("DELETE FROM " + TABLE_FAVPOKEMON + " WHERE " + COLUMN_ID + " = 13");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM " + TABLE_FAVPOKEMON);
            while(resultSet.next()) {
                System.out.println(resultSet.getString(COLUMN_ID) + " " + resultSet.getString(COLUMN_NAME));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch(SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void insertPokemon(Statement statement, int id, String name) throws SQLException{
        statement.execute("INSERT INTO " + TABLE_FAVPOKEMON + "(" + COLUMN_ID + ", " + COLUMN_NAME + ") " +
                "VALUES(" + id + ", '" + name + "')");
    }
}

















