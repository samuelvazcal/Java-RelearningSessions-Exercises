package com.samuelvazquez.generics.secondimplementation;

public class Rectangle extends Shape{
	public Rectangle(String figureName) {
		super(figureName);
	}

	@Override
	void draw() {
		System.out.println("Drawing rectangle...");
	}
}
