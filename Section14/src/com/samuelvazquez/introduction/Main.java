package com.samuelvazquez.introduction;

public class Main {
	public static void main(String[] args) {
		//catching exceptions
		try {
			int [] array = new int[2];
			System.out.println("Access element three: " + array[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown: " + e);
		}
		System.out.println("Out of the block");
	}
}
