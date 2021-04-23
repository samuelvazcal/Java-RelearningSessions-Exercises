package com.samuelvazquez.treeset2;

public class Pokemon implements Comparable<Pokemon>{
	private String name;
	private int id;
	private double weight;

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public double getWeight() {
		return weight;
	}

	public Pokemon(int id, String name, double weight) {
		this.name = name;
		this.id = id;
		this.weight = weight;
	}

	@Override
	public int compareTo(Pokemon o) {
		return this.name.compareTo(o.name);
	}
}
