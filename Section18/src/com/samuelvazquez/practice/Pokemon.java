package com.samuelvazquez.practice;

public class Pokemon {
    private String name;
    private int id;
    private double weight;
    private double height;

    public Pokemon(String name, int id, double weight, double height) {
        this.name = name;
        this.id = id;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getBMI(double weight, double height) {
        return weight / (height * height);
    }
}
