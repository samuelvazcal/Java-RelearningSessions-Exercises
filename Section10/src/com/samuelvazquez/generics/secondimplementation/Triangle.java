package com.samuelvazquez.generics.secondimplementation;

public class Triangle extends Shape{
	public Triangle(String figureName) {
		super(figureName);
	}

	@Override
	void draw() {
		System.out.println("Drawing a triangle...");
	}
}
