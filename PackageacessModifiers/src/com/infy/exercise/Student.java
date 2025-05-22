package com.infy.exercise;

public class Student {

	int studentId;
	public String studentname;
	private float totalMarksObtained;
	public float totalMarks;

	public Student(int studentId, String studentname, float totalMarksObtained, float totalMarks) {
		super();
		this.studentId = studentId;
		this.studentname = studentname;
		this.totalMarksObtained = totalMarksObtained;
		this.totalMarks = totalMarks;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public float getTotalMarksObtained() {
		return totalMarksObtained;
	}

	public void setTotalMarksObtained(float totalMarksObtained) {
		this.totalMarksObtained = totalMarksObtained;
	}

}
