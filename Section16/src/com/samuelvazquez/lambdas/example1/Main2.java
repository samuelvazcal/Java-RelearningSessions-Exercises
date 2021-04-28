package com.samuelvazquez.lambdas.example1;

public class Main2 {
	public static void main(String[] args) {
		MyNewInterface result = (x,y) -> System.out.println(x + y);
		result.mathAbstractMethod(2,5);
	}
}


interface MyNewInterface {
	void mathAbstractMethod(int x, int y);
}
