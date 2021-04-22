package com.samuelvazquez.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

//LinkedHashMap keeps maintained the track and order of insertion
public class Main {
	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("Samuel V.", 30);
		map.put("Paulina L.", 4);
		map.put("Emilia C.",52);
		map.put("Jose C.",84);

		for(Map.Entry<String,Integer> x : map.entrySet()) {
			System.out.println(x.getKey() + " " + x.getValue());
		}

		map.put("Pedro V.",54);

		System.out.println("~~~~~~~~~~~~~~~~~~~~");

		for(Map.Entry<String,Integer> x : map.entrySet()) {
			System.out.println(x.getKey() + " " + x.getValue());
		}


	}
}
