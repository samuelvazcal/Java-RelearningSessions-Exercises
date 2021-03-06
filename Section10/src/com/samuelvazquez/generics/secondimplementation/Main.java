package com.samuelvazquez.generics.secondimplementation;

public class Main {
	public static void main(String[] args) {
		Circle circle1 = new Circle("balloon");
		Circle circle2 = new Circle("glass marble");
		Circle circle3 = new Circle("sun");
		Rectangle rectangle1 = new Rectangle("bus");
		Rectangle rectangle2 = new Rectangle("bubble gum");
		Triangle triangle1 = new Triangle("pyramid");
		Triangle triangle2 = new Triangle("tortilla chip");

		GroupShape<Circle> circles = new GroupShape<>("Set of circles");
		circles.addFigure(circle1);
		circles.addFigure(circle2);
		circles.addFigure(circle3);

		GroupShape<Rectangle> rectangles = new GroupShape<>("Set of rectangles");
		rectangles.addFigure(rectangle1);
		GroupShape<Triangle> triangles = new GroupShape<>("Set of triangles");
		triangles.addFigure(triangle1);
		triangles.addFigure(triangle2);

		System.out.println("size of circles: " + circles.getSize());

		//it can work for any subclass of Shape; circles, rectangles, triangles
		System.out.println("looping through circles set: ");
		for(Shape x : circles) {
			System.out.println(x.getFigureName());
		}
		System.out.println("looping through triangles set: ");

		for(Shape x : triangles) {
			System.out.println(x.getFigureName());
		}
	}

}
