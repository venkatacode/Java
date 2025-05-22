package com.infy.assignment6;

public class RegularCourseCertification extends RRTechnicalCertification implements Certification {
	private int courseDuration;
 public RegularCourseCertification(String studentName, String courseName, int admissionTestMarks, int courseDuration) {
		super(studentName, courseName, admissionTestMarks);
		this.courseDuration=courseDuration;
	}
public int getCourseDuration() {
	return courseDuration;
}
public void setCourseDuration(int courseDuration) {
	this.courseDuration = courseDuration;
}
@Override
public void generateRegistrationId() {
	int temp=0;
	setRegistrationId(1001);
	
	}
	
	

@Override
public double calculateFee() {
	double Fees=0;
	if(getAdmissionTestMarks()>=90) {
		Fees=(double) (courseDuration*Certification.Regular_Course_Fee)-(10*100);
	}
	else if(getAdmissionTestMarks()>=75 && getAdmissionTestMarks()<=89) {
		 Fees=(double) (courseDuration*Certification.Regular_Course_Fee)-(5*100);
	}
	return Fees;
}
}
