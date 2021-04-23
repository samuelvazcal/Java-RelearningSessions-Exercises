package com.samuelvazquez.treeset2;

import java.util.TreeSet;


public class Main {
	public static void main(String[] args) {
		// Comparator using Pokemon weight
		// TreeSet<Pokemon> ts = new TreeSet<Pokemon>(new WeightComparator());

		//Comparator via Comparable interface working with names
		TreeSet<Pokemon> ts = new TreeSet<>();

		ts.add(new Pokemon(27,"Sandshrew",12.0));
		ts.add(new Pokemon(7,"Squirtle",9.0));
		ts.add(new Pokemon(25,"Pikachu",6.0));
		ts.add(new Pokemon(16,"Pidgey",1.8));
		ts.add(new Pokemon(1,"Bulbasaur",6.9));
		ts.add(new Pokemon(4,"Charmander",8.5));

		for(Pokemon x : ts) {
			System.out.println(x.getId() + " " + x.getName() + " " + x.getWeight());
		}

	}
}
