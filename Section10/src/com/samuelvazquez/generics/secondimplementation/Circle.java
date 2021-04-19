package com.samuelvazquez.generics.secondimplementation;

public class Circle extends Shape{
	public Circle(String figureName) {
		super(figureName);
	}



	@Override
	void draw() {
		System.out.println("Drawing circle");
	}

}
