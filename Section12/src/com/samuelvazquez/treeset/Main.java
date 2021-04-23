package com.samuelvazquez.treeset;

import java.util.TreeSet;


public class Main {
	public static void main(String[] args) {
		TreeSet<String> ts1 = new TreeSet<>();

		//elements are added using add() method
		ts1.add("A");
		ts1.add("B");
		ts1.add("C");

		//Duplicates will not get insert
		ts1.add("C");

		ts1.add("Z");
		ts1.add("X");
		ts1.add("Y");

		//elements get stores in default natural
		//sorting order (ascending);
		System.out.println(ts1);

		for(String x : ts1) {
			System.out.print(x + " ");
		}
	}
}
