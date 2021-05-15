package com.samuelvazquez.practice;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class PokemonTestParameterized {
    private Pokemon pokemon;
    //instance variables for the parameterized test
    private int id;
    private double weight;
    private double height;

    public PokemonTestParameterized(int id, double weight, double height) {
        this.id = id;
        this.weight = weight;
        this.height = height;
    }

    @Before
    public void before() {
        pokemon = new Pokemon("Pikachu",25,6.0,0.4);
        System.out.println("Running the test...");
    }

    @Parameterized.Parameters
    public static Collection<Object> testConditions() {
        return Arrays.asList(new Object[][]{
                {25, 6.0, 0.4},
                {25, 8.0, 0.4},
                {25, 5.0, 0.4},
                {25, 5.5, 0.4},
                {25, 6.0, 0.4}
        });
    }

    @Test
    public void getBMI() {
        double actual = pokemon.getBMI(weight,height);
        assertEquals(37.5,actual,0.1);
    }

}
