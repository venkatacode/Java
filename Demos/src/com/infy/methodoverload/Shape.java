package com.infy.methodoverload;

public class Shape {

	// Method to find the area of circle
	public float calculateArea(float radius) {
		return 3.14f * radius * radius;
	}

	// Method to find the area of rectangle
	public float calculateArea(float length, float breadth) {
		return length * breadth;
	}

	// Code another overloaded method to find the area of triangle
	// You Need to declare a Different Arguments for method overloading concept 
	//if we create arguments with different names but it matches with another method then we can get error
	public float calculateArea(float half, float breadth, float height) {

		return half * breadth * height;
	}
//	public int calculateArea( int breadth, int height) {
//
//		return  (1/2*breadth * height);
//	}
}

class Tester {

	public static void main(String[] args) {

		Shape shape = new Shape();

		float circleArea = shape.calculateArea(1.7f);
		float rectangleArea = shape.calculateArea(2.5f, 3.4f);
		float triangleArea = shape.calculateArea(0.5f,3.5f,8.0f);

		System.out.println("Area of circle: " + circleArea);
		System.out.println("Area of rectangle: " + rectangleArea);
		System.out.println("Area of triangle: " + triangleArea);
		// Invoke the method to find the area of triangle
		// Display the area of triangle
	}
}
