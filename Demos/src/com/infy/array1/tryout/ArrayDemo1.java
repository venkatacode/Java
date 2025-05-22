package com.infy.array1.tryout;

public class ArrayDemo1 {

	public static void main(String a[]) {

		// After implementing, copy the below code in JShell to execute
		int scores[] = { 281, 344, 265, 272, 236, 324, 287 };
		double sum = 0, avg = 0;
		int count = 0, c = 0, y = 0;

		for (int index = 0; index < scores.length; index++) {
			sum = sum + scores[index];
		}

		avg = sum / scores.length;

		System.out.println("The average score of te team is " + avg);
		// Complete the code as desired output shown in problem statement
		for (int index = 0; index < scores.length; index++) {
			if (scores[index] > avg) {
				count = count + 1;
			} else if (scores[index] == avg) {
				c = c + 1;
			} else {
				y = y + 1;
			}

		}
		System.out.println("No.of matches are equal to average:" + c);
		System.out.println("No.of matches having Score below average is:" + y);
		System.out.println("No.of matches having score above average is:" + count);
	}
}
