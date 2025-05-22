
package com.infy.exercise2;

import com.infy.exercise.Student;
public class Tester {
	public static void main(String args[]) {
	Student s=new Student(101, "alan", 400.0f, 500.0f);
	StudentDetails std=new StudentDetails();
	std.displayStudentDetails(s);
	std.calculatePercentage(s);
}
}
