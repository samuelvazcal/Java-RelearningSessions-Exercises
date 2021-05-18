package com.samuelvazquez.secondexample.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Datasource {
    public static final String DB_NAME = "world";
    public static final String CONNECTION_STRING = "jdbc:mysql://localhost/" + DB_NAME;
    public static final String USER_NAME = "root";
    public static final String USER_PASSWORD = "root";
    public static final String TABLE_CITY = "city";
    public static final String COLUMN_ID = "ID";
    public static final String COLUMN_NAME = "Name";
    public static final String COLUMN_COUNTRYCODE = "CountryCode";
    public static final String COLUMN_DISTRICT = "District";
    public static final String COLUMN_POPULATION = "Population";

    private Connection connection;

    public boolean open() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING,USER_NAME,USER_PASSWORD);
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

    public List<City> queryCity() {

        try (Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM " + TABLE_CITY)){

            List<City> cities = new ArrayList<>();
            while(resultSet.next()) {
                City city = new City();
                city.setId(resultSet.getInt(COLUMN_ID));
                city.setName(resultSet.getString(COLUMN_NAME));
                city.setCountryCode(resultSet.getString(COLUMN_COUNTRYCODE));
                city.setDistrict(resultSet.getString(COLUMN_DISTRICT));
                city.setPopulation(resultSet.getInt(COLUMN_POPULATION));
                cities.add(city);
            }
            return cities;

        }catch (SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
            return null;
        }
    }
}
