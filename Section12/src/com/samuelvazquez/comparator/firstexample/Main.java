package com.samuelvazquez.comparator.firstexample;

import java.util.ArrayList;
import java.util.Collections;


public class Main {
	public static void main(String[] args) {
		ArrayList<Pokemon> list = new ArrayList<>();
		list.add(new Pokemon(27,"Sandshrew",12.0,0.6));
		list.add(new Pokemon(7,"Squirtle",9.0,0.5));
		list.add(new Pokemon(25,"Pikachu",6.0,0.4));
		list.add(new Pokemon(16,"Pidgey",1.8,0.3));
		list.add(new Pokemon(1,"Bulbasaur",6.9,0.7));
		list.add(new Pokemon(4,"Charmander",8.5,0.6));

		//Sorting by height using Comparable
		Collections.sort(list);
		printCollection(list);

		//Sorting by id using comparator
		IdCompare idCompare = new IdCompare();
		Collections.sort(list,idCompare);
		printCollection(list);

		//Sorting by name using comparator
		NameCompare nameCompare = new NameCompare();
		Collections.sort(list, nameCompare);
		printCollection(list);

		//Sorting by weight using comparator
		WeightCompare weightCompare = new WeightCompare();
		Collections.sort(list,weightCompare);
		printCollection(list);

	}

	public static void printCollection(ArrayList<Pokemon> list) {
		for(Pokemon x : list) {
			System.out.println(x.getId() + " " + x.getName() + " " + x.getWeight() + " " + x.getHeight());
		}
		System.out.println("~~~~~~~~~~~~~~~~~");
	}
}
