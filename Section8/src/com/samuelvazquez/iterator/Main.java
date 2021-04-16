package com.samuelvazquez.iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		LinkedList<String> pokemonList = new LinkedList<String>();
		pokemonList.add("Pikachu");
		pokemonList.add("Squirtle");
		pokemonList.add("Pidgey");
		pokemonList.add("Growlithe");
		pokemonList.add("Sandshrew");
		pokemonList.add("Bellsprout");

		printListIterator(pokemonList);

		pokemonList.add(5,"Zubat");
		pokemonList.add("Eevee");
		printListIterator(pokemonList);

		System.out.println("Remove item(s) that start with the character: ");
		String c = scanner.nextLine();
		removeItemIfStartsWith(pokemonList,c);
		printListIterator(pokemonList);
	}

	public static void removeItemIfStartsWith(LinkedList<String> list, String c) {
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			if(s.startsWith(c.toUpperCase())) {
				it.remove();
			}
		}
	}

	public static void printListIterator(LinkedList<String> list) {
		int count = 0;
		System.out.println("Using Iterator:\n");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			count++;
			System.out.println(count + ". " + it.next());
		}
		System.out.println("=================");
	}

	public static void printListForEach(LinkedList<String> list) {
		int count = 0;
		for(String x : list) {
			count++;
			System.out.println(count+". " + x);
		}
		System.out.println("===================");
	}

}
