package com.samuelvazquez.trycatchblock3;

public class Main5 {
	public static void main(String[] args) {
		//handling exceptions without maintaining the order of exceptions
		//output: compile-time eror
		try{
			int a[]=new int[5];
			a[5]=30/0;
		} catch(Exception e){
			System.out.println("common task completed");
		//} catch(ArithmeticException e){
		//	System.out.println("task1 is completed");
		//} catch(ArrayIndexOutOfBoundsException e){
		//	System.out.println("task 2 completed");
		}
		System.out.println("rest of the code...");
	}
}
