package com.samuelvazquez.trycatchblocks;

public class Main {
	public static void main(String[] args) {
		//now, with the try-catch block the rest of the code is executed
		int i = 50;
		int j = 0;

		try {
			int data = i/j;

		}
		catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("Can't be divided by zero");
			System.out.println(i/(j+2));

		}
		// from here, the rest of the lines will not be executed until I add a try-block code.
		System.out.println("rest of the code");

		try {
			int [] array = {1,3,5,7};
			System.out.println(array[10]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("rest of the code 2");
	}
}
