package com.infy.asssignment4;

public class Courseregistration {

	private String studentName;
	private int registrationId;
	private float qualifyingMarks;
	private double courseFee;
	private int courseId;
	private boolean hostelRequired;

	public double getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(double courseFee) {
		this.courseFee = courseFee;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}

	public float getQualifyingMarks() {
		return qualifyingMarks;
	}

	public void setQualifyingMarks(float qualifyingMarks) {
		this.qualifyingMarks = qualifyingMarks;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public boolean isHostelRequired() {
		return hostelRequired;
	}

	public void setHostelRequired(boolean hostelRequired) {
		this.hostelRequired = hostelRequired;
	}

	public boolean validateMarks() {
		if (getQualifyingMarks() > 65 && getQualifyingMarks() < 69) {
			setCourseFee(getCourseFee() * 0.5);
		} else if (getQualifyingMarks() >= 70 && getQualifyingMarks() < 84) {
			setCourseFee(getCourseFee() * 0.9);
		} else if (getQualifyingMarks() >= 85) {
			setCourseFee(getCourseFee() * 0.15);
		} else {
			System.out.println("Marks are less than 65 You are not Eligiblee ");
		}
		return false;
	}

	public boolean validateCourseId() {

		if (getCourseId() == 1001) {
			setCourseFee(55000);
		} else if (getCourseId() == 1002) {
			setCourseFee(35675);
		} else if (getCourseId() == 1003) {
			setCourseFee(28300);
		} else if (getCourseId() == 1004) {
			setCourseFee(22350);
		} else if (getCourseId() == 1005) {
			setCourseFee(115000);
		} else {
			System.out.println("Invalid Course Id Please Try again");
			return false;
		}
		return validateMarks();
	}

	public String hostelRequired() {

		if (isHostelRequired() != true) {
			return "No";
		} else {
			return "Yes";

		}
	}

	public void calculateCourseFee() {
		validateCourseId();
	}

	class Tester {
		public static void main(String[] args) {
			Courseregistration cr = new Courseregistration();

			cr.setStudentName("Peter");
			cr.setRegistrationId(5001);
			cr.setQualifyingMarks(58);
			cr.setCourseId(1005);
			cr.setHostelRequired(true);
			cr.calculateCourseFee();

			cr.setStudentName("Peter");
			cr.setRegistrationId(5001);
			cr.setQualifyingMarks(68);
			cr.setCourseId(1006);
			cr.setHostelRequired(true);
			cr.calculateCourseFee();

			cr.setStudentName("Peter");
			cr.setRegistrationId(5001);
			cr.setQualifyingMarks(78);
			cr.setCourseId(1005);
			cr.setHostelRequired(false);
			cr.calculateCourseFee();

			System.out.println("*******CourseAllocation*********\n");
			System.out.println("StudentName:" + cr.getStudentName());
			System.out.println("CourseId:" + cr.getCourseId());
			System.out.println("Qualifying Marks:" + cr.getQualifyingMarks());
			System.out.println("Student`s Registration:" + cr.getRegistrationId());
			System.out.println("Total Course Fee:" + cr.getCourseFee());
			System.out.println("Hostel Required:" + cr.hostelRequired());
		}

	}
}
