package com.infy.genericarraylist.methods;
import java.util.ArrayList;
import java.util.List;
public class Student{
	
	
		private int studentId;
		private String studentName;
		private boolean courseRegistered;

		public Student(int studentId, String studentName, boolean courseRegistered) {
			this.studentId = studentId;
			this.studentName = studentName;
			this.courseRegistered = courseRegistered;
		}

		public int getStudentId() {
			return studentId;
		}

		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		public boolean getCourseRegistered() {
			return courseRegistered;
		}

		public void setCourseRegistered(boolean courseRegistered) {
			this.courseRegistered = courseRegistered;
		}

	}

	class Tester3 {
		public static void main(String[] args) {
			List<Student> studentList = new ArrayList<Student>();
			studentList.add(new Student(1001, "Steve", true));
			studentList.add(new Student(1002, "Rachel", false));
			studentList.add(new Student(1003, "Monica", true));
			studentList.add(new Student(1004, "David", true));

			List<String> studentNames = new ArrayList<String>();
			// Iteration of the studentList using for-each loop
			for (Student student : studentList) {
				studentNames.add(student.getStudentName());
				System.out.println("Student ID : " + student.getStudentId());
				System.out.println("Student Name : " + student.getStudentName());
				System.out.println("Course Registered : " + student.getCourseRegistered());
			}
			System.out.println("Student Names : " + studentNames);

		}
	}


