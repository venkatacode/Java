package com.infy.staticdemo;

public class Car {

	private String color;
	private static int numberOfCars = 0; // static variable

	public Car(String color) {
		// code here
		this.color = color;
		numberOfCars = numberOfCars + 1;

	}

	public String getColor() { // static method
		return this.color;
	}

	public static int getNumberOfCars() {
		return numberOfCars;
	}

	public void displayColor() {
		System.out.println("Color of the car : " + this.color);
	}
}

class Tester {

	public static void displayCar() {
		System.out.println("Displaying Car details");
	}

	public static void main(String[] args) {
		Car c1 = new Car("Red");
		Car c2 = new Car("Green");
		Car c3 = new Car("Blue");
		/*
		 * Car c=new Car(""); if we create another object the Count of the cars will
		 * increase Remove the comments of the Car and check the count
		 */
		/*
		 * write code here to display the color
		 */
		Tester t = new Tester();
		t.displayCar();
		System.out.println("No.of cars created:" + c1.getNumberOfCars());
		System.out.println("Color of the cars:");
		System.out.println("Color of the car:" + c1.getColor());
		System.out.println("Color of the car:" + c2.getColor());
		System.out.println("Color of the car:" + c3.getColor());
	}

}
