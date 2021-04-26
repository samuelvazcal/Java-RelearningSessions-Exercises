package com.samuelvazquez.finallyblock;

public class Main2 {
	public static void main(String[] args) {
		//exception occurs but not handled
		try {
			int data=25/0;
			System.out.println(data);
		} catch(NullPointerException e){
			System.out.println(e);
		} finally{
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");
	}
}
