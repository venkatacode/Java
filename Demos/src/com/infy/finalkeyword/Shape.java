package com.infy.finalkeyword;

public class Shape {

	final private double length;
	final private double breadth;

	public Shape(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public final double getLength() {
		return length;
	}

	public final double getBreadth() {
		return breadth;
	}

	double getArea() {
		return 0;
	}
}

// derived class one
class Rectangle extends Shape {

	public Rectangle(double length, double breadth) {
		super(length, breadth);
	}

	@Override
	double getArea() {
		return this.getLength() * this.getBreadth();
	}

}

// derived class two
class Square extends Shape {
	public Square(double side) {
		// calling Shape class constructor
		super(side, side);
	}

	@Override
	double getArea() {
		return this.getLength() * this.getBreadth();
	}

}

class Test {
	public static void main(String[] args) {
		Shape shape1 = new Rectangle(50, 30);
		Shape shape2 = new Square(60);
		System.out.println("Area of shape1 : " + shape1.getArea());
		System.out.println("Area of shape2 : " + shape2.getArea());

	}
}
