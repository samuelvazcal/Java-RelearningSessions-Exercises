package com.samuelvazquez.comparable.secondexample;

//Comparable<Hero> to sort a list of Hero based on one of its data members
public class Pokemon implements Comparable<Pokemon>{
	private int id;
	private String name;
	private double weight;

	//Constructor
	public Pokemon(int id, String name, double weight) {
		this.id = id;
		this.name = name;
		this.weight = weight;
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

	/*Comparing based on field 'id'
	@Override
	public int compareTo(Hero pok) {
		return this.id - pok.id;
	}


	/*Comparing based on weight (ascending order)
	@Override
	public int compareTo(Hero pok) {
		return Double.compare(this.weight,pok.weight);
	}
	 */

	@Override
	public int compareTo(Pokemon pok) {
		return this.name.compareTo(pok.name);
	}
}
