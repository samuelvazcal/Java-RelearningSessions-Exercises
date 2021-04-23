package com.samuelvazquez.set2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Main {
	public static void main(String[] args) {
		Integer [] arrayA = {1,3,2,4,8,9,0};
		Set<Integer> setA = new HashSet<>();
		setA.addAll(Arrays.asList(arrayA));
		Set<Integer> setB = new HashSet<>();
		setB.addAll(Arrays.asList(1,3,7,5,4,0,7,5));

		System.out.println("set A:" + setA);
		System.out.println("set B: " + setB);

		//Finding union of setA and setB
		Set<Integer> unionData = new HashSet<>(setA);
		unionData.addAll(setB);
		System.out.println("Union of setA & setB: " + unionData);

		//Finding Intersection of setA and setB
		Set<Integer> intersectionData = new HashSet<>(setA);
		intersectionData.retainAll(setB);
		System.out.println("intersection of setA & setB: " + unionData);

		//Finding Difference of setA and setB
		Set<Integer> differenceData = new HashSet<>(setA);
		differenceData.removeAll(setB);
		System.out.println("Difference of setA & setB: " + unionData);


	}
}
