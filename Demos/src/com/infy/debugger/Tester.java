package com.infy.debugger;

public class Tester {
	public static void main(String[] args) {
		int number1 = 1, number2 = 1;
		System.out.println("Fibonacci Series:");
		for (int index = 0; index < 6; index++) {
			int number3 = number1 + number2;
			System.out.print(number3 + " ");
			number2 = number3;
			number1 = number2;

		}

	}
}
