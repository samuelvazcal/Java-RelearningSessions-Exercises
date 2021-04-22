package com.samuelvazquez.map.hashmap4;

import java.util.HashMap;
import java.util.Map;


public class Main {
	public static void main(String[] args) {
		HashMap<Integer,String> fruitMap = new HashMap<Integer,String>();

		fruitMap.put(1,"Mango");
		fruitMap.put(2,"Strawberry");
		fruitMap.put(3,"Watermelon");
		fruitMap.put(4,"Grapes");
		fruitMap.put(5,"Apple");
		fruitMap.put(1,"Pineapple");

		for(Map.Entry<Integer,String> x : fruitMap.entrySet()) {
			System.out.println(x.getKey() + " " + x.getValue());
		}

		System.out.println("Trying remove");
		fruitMap.put(null,"xxx");

		for(Map.Entry<Integer,String> x : fruitMap.entrySet()) {
			System.out.println(x.getKey() + " " + x.getValue());
		}
	}
}
