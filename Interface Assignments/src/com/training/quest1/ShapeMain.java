package com.training.quest1;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape = (x, y) -> {
			System.out.println("Area of Rectangle " + (x * y));
		};
		shape.area(5, 7);

		shape = (x, y) -> {
			System.out.println("Area of Triangle " + (0.5 * x * y));
		};
		shape.area(3, 2);

		shape = (x, y) -> {
			System.out.println("Area of square " + (x * x));
		};
		shape.area(3, 9);

	}

}
