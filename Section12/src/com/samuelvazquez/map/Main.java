package com.samuelvazquez.map;

import java.util.HashMap;
import java.util.Map;


public class Main {
	public static void main(String[] args) {
		HashMap<String, Employee> staff = new HashMap<String, Employee>();
		staff.put("001", new Employee("Michael Scott"));
		staff.put("002", new Employee("Jim Halpert"));
		staff.put("003", new Employee("Dwight Schrute"));
		staff.put("004", new Employee("Pam Beasley"));
		staff.put("005", new Employee("Stanley Hudson"));
		staff.put("006", new Employee("Andy Bernard"));

		System.out.println(staff);

		staff.remove("006");

		System.out.println(staff);

		staff.replace("001",new Employee("Robert California"));

		System.out.println(staff);

		//returns a Set view of the map
		//System.out.println(staff.entrySet());

		for(Map.Entry<String, Employee> x : staff.entrySet()) {
			System.out.println(x.getKey() + " " +  x.getValue());
		}

	}
}
