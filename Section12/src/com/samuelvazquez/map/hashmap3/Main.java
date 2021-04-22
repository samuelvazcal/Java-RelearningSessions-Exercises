package com.samuelvazquez.map.hashmap3;

import java.util.HashMap;
import java.util.Map;


public class Main {
	public static void main(String[] args) {
		Map<Integer, String> hm1 = new HashMap<>();

		hm1.put(1,"Samuel");
		hm1.put(2,"Jose");
		hm1.put(3,"Marisela");
		hm1.put(4,"Daniela");

		System.out.println(hm1);

		for(Map.Entry<Integer,String> x : hm1.entrySet()) {
			System.out.println(x.getKey() + " : " + x.getValue());
		}
	}
}
