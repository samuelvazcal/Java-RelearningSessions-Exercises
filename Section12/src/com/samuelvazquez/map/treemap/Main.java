package com.samuelvazquez.map.treemap;

import java.security.SecureRandom;
import java.util.Map;
import java.util.TreeMap;


public class Main {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(100,"Samuel");
		map.put(103,"Jose");
		map.put(102,"Marisela");
		map.put(101,"Daniela");
		map.put(106,"Pedro");
		map.put(105,"Emilia");

		for(Map.Entry<Integer,String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		//Returns key-value pairs whose keys are less than the specified key
		System.out.println("Descending Map: " + map.descendingMap());
		//Returns key-value pairs whose keys are greater than or equal to the specified key
		System.out.println("tailMap: " + map.tailMap(102));
		//Returns key-value pairs exists in between the specified key.
		System.out.println("subMap: " + map.subMap(100,103));


	}
}
