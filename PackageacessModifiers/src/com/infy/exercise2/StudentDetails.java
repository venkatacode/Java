package com.infy.exercise2;

import com.infy.exercise.Student;

public class StudentDetails {

	public StudentDetails(){
		
	}
	public void displayStudentDetails(Student s) {
		System.out.println("Student Details");
		System.out.println("StudentId:"+s.getStudentId());
		System.out.println("StudentName is:"+s.studentname);
		System.out.println("Studentmarks:"+s.getTotalMarksObtained());
		System.out.println("TotalMarks:"+s.totalMarks);
		
		
	}
	public void calculatePercentage(Student s) {
		double sum=(s.getTotalMarksObtained()/s.totalMarks)*100;
	System.out.println("StudentPercentage is:"+sum+ "%");;

	}
}
