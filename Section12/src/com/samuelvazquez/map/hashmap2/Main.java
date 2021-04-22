package com.samuelvazquez.map.hashmap2;

import java.util.HashMap;
import java.util.Map;


public class Main {
	public static void main(String[] args) {
		Map<String,Integer> hm = new HashMap<>();
		hm.put("a",100);
		hm.put("b",200);
		hm.put("c",300);
		hm.put("d",400);
		hm.put("e",500);

		for(Map.Entry<String,Integer> x : hm.entrySet()) {
			System.out.print(x.getKey()+ ":");
			System.out.println(x.getValue());
		}


	}
}
