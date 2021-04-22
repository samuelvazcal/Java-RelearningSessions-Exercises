package com.samuelvazquez.map.hashmap;

import java.util.HashMap;


public class Main {
	public static void main(String[] args) {
		HashMap<String, String> capitalCities = new HashMap<>();
		capitalCities.put("Mexico","CDMX");
		capitalCities.put("Japan","Tokyo");
		capitalCities.put("Colombia","Bogota");
		capitalCities.put("USA","Washington");
		capitalCities.put("Canada","Ottawa");
		System.out.println(capitalCities);

		//access an value via its key
		String accessItem = capitalCities.get("Japan");
		System.out.println(accessItem);

		capitalCities.remove("USA");
		System.out.println(capitalCities);

		capitalCities.put("France","Paris");
		System.out.println(capitalCities);

		int size = capitalCities.size();
		System.out.println("How many items does the map have?: " + size);

		System.out.println("Obtaining only keys");

		for(String x : capitalCities.keySet()) {
			System.out.println(x);
		}

		System.out.println("Obtaining only values");

		for(String x: capitalCities.values()) {
			System.out.println(x);
		}
	}
}
