package com.samuelvazquez.lambdas.example2;

import java.util.ArrayList;


public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> arrL = new ArrayList<Integer>();
		arrL.add(1);
		arrL.add(2);
		arrL.add(3);
		arrL.add(4);
		arrL.add(5);
		arrL.add(6);
		arrL.add(7);
		arrL.add(8);

		//Using lambda expression to print all elements of arrL
		arrL.forEach(n -> System.out.println(n));

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");

		//using lambda expression to print even elements of arrL
		arrL.forEach(n -> {
			if(n%2==0) {
				System.out.println(n);
			}
		});
	}
}
