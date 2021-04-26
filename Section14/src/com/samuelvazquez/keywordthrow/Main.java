package com.samuelvazquez.keywordthrow;

public class Main {
	public static void main(String[] args) {
		validate(19);
		System.out.println("rest of the code");
	}

	static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("--- not valid ---");
		} else
			System.out.println("welcome to vote");
	}
}
