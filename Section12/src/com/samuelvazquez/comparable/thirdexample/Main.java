package com.samuelvazquez.comparable.thirdexample;

import com.samuelvazquez.comparable.secondexample.Pokemon;

import java.util.ArrayList;
import java.util.Collections;


public class Main {
	public static void main(String[] args) {
		ArrayList<Hero> list = new ArrayList<>();
		list.add(new Hero(1,"Spider-Man",1.78));
		list.add(new Hero(4,"Captain America",1.85));
		list.add(new Hero(3,"Black Panther",1.83));
		list.add(new Hero(5,"Hulk",2.43));
		list.add(new Hero(2,"Dr. Strange",1.84));
		list.add(new Hero(7,"Iron Man",1.85));
		list.add(new Hero(6,"Ant Man",0.01));

		printCollection(list);

		Collections.sort(list);

		printCollection(list);
	}

	public static void printCollection(ArrayList<Hero> list) {
		for(Hero x : list) {
			System.out.println(x.getId() + " " + x.getName() + " " + x.getHeight());
		}
		System.out.println("----------------");
	}
}
