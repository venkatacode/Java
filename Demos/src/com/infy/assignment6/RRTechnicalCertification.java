package com.infy.assignment6;

public class RRTechnicalCertification implements Certification {
	private String studentName;
	private String courseName;
	private int registrationId = 1001;
	private int admissionTestMarks;
	public int counter = 0;

	public RRTechnicalCertification(String studentName, String courseName, int admissionTestMarks) {
		super();
		this.studentName = studentName;
		this.courseName = courseName;
		this.admissionTestMarks = admissionTestMarks;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}

	public int getAdmissionTestMarks() {
		return admissionTestMarks;
	}

	public void setAdmissionTestMarks(int admissionTestMarks) {
		this.admissionTestMarks = admissionTestMarks;
	}

	public void generateRegistrationId() {
//		setRegistrationId(1003);
//		if(getCourseName()=="Angular") {
//		count=counter+2;	
//		}else if(getCourseName()=="J2EE") {
//			count=counter+2;
//		}else {
//			count=-1;
//		}
	}

	public double calculateFee() {
		double Fees = 0;

		return Fees;
	}
}
