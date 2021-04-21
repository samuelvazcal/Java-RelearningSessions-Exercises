package com.samuelvazquez.comparable.secondexample;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
	public static void main(String[] args) {
		ArrayList<Pokemon> list = new ArrayList<>();
		list.add(new Pokemon(27,"Sandshrew",12.0));
		list.add(new Pokemon(7,"Squirtle",9.0));
		list.add(new Pokemon(25,"Pikachu",6.0));
		list.add(new Pokemon(16,"Pidgey",1.8));
		list.add(new Pokemon(1,"Bulbasaur",6.9));
		list.add(new Pokemon(4,"Charmander",8.5));

		Collections.sort(list);

		printCollection(list);
	}

	public static void printCollection(ArrayList<Pokemon> list) {
		for(Pokemon x : list) {
			System.out.println(x.getId() + " " + x.getName() + " " + x.getWeight());
		}
	}
}
