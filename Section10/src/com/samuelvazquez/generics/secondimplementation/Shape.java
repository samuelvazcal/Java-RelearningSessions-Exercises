package com.samuelvazquez.generics.secondimplementation;

public abstract class Shape {

	private String figureName;

	public String getFigureName() {
		return figureName;
	}

	public Shape(String figureName) {
		this.figureName = figureName;
	}

	abstract void draw();
}
