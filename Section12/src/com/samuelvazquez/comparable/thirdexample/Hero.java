package com.samuelvazquez.comparable.thirdexample;

public class Hero implements Comparable<Hero>{
	private int id;
	private String name;
	private double height;

	public Hero(int id, String name, double height) {
		this.id = id;
		this.name = name;
		this.height = height;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	/*Comparing based on id
	@Override
	public int compareTo(Hero o) {
		return this.id - o.id;
	}
	 */

	/*Comparing based on name (ascending)
	@Override
	public int compareTo(Hero hero) {
		return this.name.compareTo(hero.name);
	}
	 */

	//Comparing based on height (descending)
	@Override
	public int compareTo(Hero hero) {
		return Double.compare(hero.height, this.height);
	}

}
