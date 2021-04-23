package com.samuelvazquez.set3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class Main {
	public static void main(String[] args) {
		Set<Integer> data = new LinkedHashSet<>();
		data.add(31);
		data.add(21);
		data.add(41);
		data.add(11);
		data.add(61);
		data.add(51);
		System.out.println(data);
		System.out.println(data.add(21));

		ArrayList<Integer> newData = new ArrayList<>();
		newData.add(91);
		newData.add(71);
		newData.add(81);
		newData.add(31);
		data.addAll(newData);
		System.out.println("Set: " + data);

		System.out.println("Does the Set contains '91'?" + data.contains(91));
		System.out.println("Does the Set contains 'Interview Time!'?" + data.contains("Interview Time!"));

		Iterator it = data.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
