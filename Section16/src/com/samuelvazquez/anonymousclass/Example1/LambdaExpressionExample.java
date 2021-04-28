package com.samuelvazquez.anonymousclass.Example1;

public class LambdaExpressionExample {
	public static void main(String[] args) {
		int width = 10;

		//without lambda, drawable implementation using anonymous class
		Drawable d = new Drawable() {
			@Override
			public void draw() {
				System.out.println("Drawing " + width);
			}
		};

		d.draw();

	}
}


interface Drawable {
	void draw();
}
