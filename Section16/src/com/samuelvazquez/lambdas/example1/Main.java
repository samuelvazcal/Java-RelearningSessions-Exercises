package com.samuelvazquez.lambdas.example1;


// Java program to demonstrate lambda expressions
// to implement a user defined functional interface.

public class Main {
	public static void main(String[] args) {
		//lambda expression to implement FuncInterface (a functional interface)
		//this interface by default implements abstractFun()
		FuncInterface fobj = (int x) -> System.out.println(2*x);

		//this calls above lambda expression and prints 10
		fobj.abstractFun(5);
	}
}


// A sample functional interface (An interface with
// single abstract method)
interface FuncInterface {
	//an abstract method(function)
	void abstractFun(int x);

	//a non-abstract (or default) function
	default void normalFun() {
		System.out.println("Hello");
	}
}
