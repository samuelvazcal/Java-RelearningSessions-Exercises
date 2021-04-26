package com.samuelvazquez.trycatchblock3;

public class Main2 {
	public static void main(String[] args) {
		//the invoked exception is ArrayIndexOutOfBounds Exception
		try {
			int a [] = new int[5];
			System.out.println(a[10]);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException e");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException e");
		} catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("rest of the code");
	}
}
