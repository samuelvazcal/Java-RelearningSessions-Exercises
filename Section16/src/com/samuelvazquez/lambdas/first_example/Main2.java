package com.samuelvazquez.lambdas.first_example;

public class Main2 {
	public static void main(String[] args) {
		MyNewInterface result = (x,y) -> System.out.println(x + y);
		result.mathAbstractMethod(2,5);
	}
}


interface MyNewInterface {
	void mathAbstractMethod(int x, int y);
}
