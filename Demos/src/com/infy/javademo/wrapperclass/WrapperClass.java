package com.infy.javademo.wrapperclass;

public class WrapperClass {

	private String studentId;
	private String name;
	private String examId;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExamId() {
		return examId;
	}

	public void setExamId(String examId) {
		this.examId = examId;
	}

	public String generateExamId() {
		Integer.parseInt(this.getStudentId());
		name = name.substring(0, 3) + "-" + name.substring(5, 8);
		//use the studentId with different variable so the actual studentId will be in the same variable
		String last = studentId.substring(studentId.length() - 1);
		int square = Integer.parseInt(last);
		int square1=(int)Math.pow(square, 2);
		examId = name + ":" + studentId + "-" + square1;
		return examId;
	}
}

class Tester {
	public static void main(String[] args) {
		WrapperClass stud1 = new WrapperClass();
		WrapperClass stud2 = new WrapperClass();
		stud1.setStudentId("4596");
		stud1.setName("John Whedon");
		stud2.setStudentId("3412");
		stud2.setName("Ross Stark");
		stud1.generateExamId();
		stud2.generateExamId();
		System.out.println("Exam Ids are:");
		System.out.println(stud1.getExamId());
		System.out.println(stud2.getExamId());

	}
}
