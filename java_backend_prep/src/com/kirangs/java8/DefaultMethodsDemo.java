package com.kirangs.java8;

interface Shape {
	void draw();

	default void check() {
		System.out.println("checked");
	}
}

class Rectangle implements Shape {

	public void check() {
		System.out.println("Rectangle checked");
	}

	@Override
	public void draw() {

		System.out.println("Rectangle Shape");
	}

}

class Square implements Shape {

	@Override
	public void draw() {

		System.out.println("Square Shape");
	}

}

class Circle implements Shape {

	@Override
	public void draw() {

		System.out.println("Circle Shape");
	}

}

public class DefaultMethodsDemo {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle();
		rectangle.check();

		Square square = new Square();
		square.check();

	}

}
