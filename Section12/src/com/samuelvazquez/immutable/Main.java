package com.samuelvazquez.immutable;

import java.util.HashMap;
import java.util.Map;


public class Main {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("Grass","Male");
		map.put("Cerulean City","Naughty");
		Pokemon pokemon1 = new Pokemon("Pikachu",25,map);
		System.out.println(pokemon1.getName());
		System.out.println(pokemon1.getId());
		System.out.println(pokemon1.getMetadata());

		map.put("Fire","Female");
		//remains unchanged due to deep copy in constructor
		System.out.println(pokemon1.getMetadata());
		//remains unchanged due to copy in getter
		pokemon1.getMetadata().put("Flying","Male");
		System.out.println(pokemon1.getMetadata());

	}
}


//class must be declared as final
final class Pokemon {
	//data members are declared as private and final
	private final String name;
	private final int id;
	private final Map<String, String> metadata;

	//parameterized constructor that initializes all the fields performing a deep copy
	public Pokemon(String name, int id, Map<String, String> metadata) {
		this.name = name;
		this.id = id;
		Map<String,String> tempMap = new HashMap<>();
		for(Map.Entry<String,String> x : metadata.entrySet()) {
			tempMap.put(x.getKey(),x.getValue());
		}
		this.metadata = tempMap;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	//no setters, avoid option to change the value of instance variables

	//deep copy of objects in the getter method, to return a copy instead the actual object reference
	public Map<String, String> getMetadata() {
		Map<String,String> tempMap = new HashMap<>();
		for(Map.Entry<String,String> x : this.metadata.entrySet()) {
			tempMap.put(x.getKey(),x.getValue());
		}
		return tempMap;
	}

}
