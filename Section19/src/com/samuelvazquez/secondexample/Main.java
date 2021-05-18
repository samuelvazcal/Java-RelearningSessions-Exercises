package com.samuelvazquez.secondexample;

import com.samuelvazquez.secondexample.model.City;
import com.samuelvazquez.secondexample.model.Datasource;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Datasource datasource = new Datasource();
        if(!datasource.open()) {
            System.out.println("Can't open datasource");
            return;
        }
        List<City> cityList = datasource.queryCity();
        if(cityList == null) {
            System.out.println("No cities!");
            return;
        }

        for(City city : cityList) {
            System.out.println("id: " + city.getId() + ", name: " + city.getName());
        }
        datasource.close();
    }
}
