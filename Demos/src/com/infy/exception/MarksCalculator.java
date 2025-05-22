package com.infy.exception;

public class MarksCalculator {
	

		public static void calculateAverage(int... marks) {

			if (marks.length != 0) {
				int sum = 0;
				for (int i = 0; i < marks.length; i++) {
					sum += marks[i];
				}
				System.out.println("Average marks: " + sum / marks.length);
			} else {
				throw new ArithmeticException("The marks list is not updated");
			}

		}

		public static void main(String[] args) {
			try {
				
				calculateAverage(20,30,40,50,60);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			} catch (Exception exception) {
				System.out.println("Some error occurred");
			}
		}
	}

	// Try executing this code and observe the output.

	// Try passing some values as the parameter to the calculateAverage() method and
	// observe the output.

	// Try throwing an Exception object instead of a ArithmeticException object and
	// observe the output.

