package com.samuelvazquez.practice;

import org.junit.*;

import java.nio.file.WatchEvent;

import static org.junit.Assert.*;

public class PokemonTest {

    Pokemon pikachu;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("This executes before any test cases.");
    }

    @Before
    public void setup() {
        pikachu = new Pokemon("Pikachu",25,6.0,0.4);
        System.out.println("Running a test!");
    }

    @Test
    public void getName() {
        String name = pikachu.getName();
        assertEquals("Pikachu",name);
    }

    @Test
    public void getId() {
        int id = pikachu.getId();
        assertEquals(25,id);
    }

    @Test
    public void getWeight() {
        double weight = pikachu.getWeight();
        assertEquals(6.0,weight,0);
    }

    @Test
    public void getHeight() {
        double height = pikachu.getHeight();
        assertEquals(0.4,height,0);
    }

    @Test
    public void getBMI() {
        double bmi = pikachu.getBMI(6.2,0.41);
        assertEquals(36.88,bmi,0.01);
    }

    @After
    public void tearDown() {
        System.out.println("The test method process ended");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("This executes after any test cases.");
    }
}