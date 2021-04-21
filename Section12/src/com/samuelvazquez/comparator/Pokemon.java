package com.samuelvazquez.comparator;

//Comparable<Hero> to sort a list of Hero based on one of its data members
public class Pokemon implements Comparable<Pokemon>{
	private int id;
	private String name;
	private double weight;
	private double height;

	//Constructor
	public Pokemon(int id, String name, double weight, double height) {
		this.id = id;
		this.name = name;
		this.weight = weight;
		this.height = height;
	}

	//Getter methods for accessing private data
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

	public double getHeight() {
		return height;
	}

	@Override
	public int compareTo(Pokemon pokemon) {
		return Double.compare(this.height,pokemon.height);
	}
}
