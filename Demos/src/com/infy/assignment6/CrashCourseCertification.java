package com.infy.assignment6;

public class CrashCourseCertification extends RRTechnicalCertification implements Certification {

	public CrashCourseCertification(String studentName, String courseName, int admissionTestMarks) {
		super(studentName, courseName, admissionTestMarks);
	}

	@Override
	public void generateRegistrationId() {
		int temp = 0;
//		
		if (getRegistrationId() % 2 != 0) {
			setRegistrationId(getRegistrationId());
			counter = counter + 2;
//			setRegistrationId(counter);
			setRegistrationId(getRegistrationId() + counter);
		} else {
			setRegistrationId(getRegistrationId());
			counter = counter + 2;
			setRegistrationId(getRegistrationId() + counter);
		}
	}

	@Override
	public double calculateFee() {

		double Fees = 0;
		if (getAdmissionTestMarks() >= 90) {

			Fees = (double) Certification.Crash_Course_Fee - (Certification.Crash_Course_Fee * (5 / 100));

			Fees = Fees + Certification.Crash_Course_Fee * (12.36 / 100);
		}

		else if (getAdmissionTestMarks() >= 75 && getAdmissionTestMarks() <= 89) {

			Fees = (double) Certification.Crash_Course_Fee - (Certification.Crash_Course_Fee * (10 / 100));

			Fees = Fees + Certification.Crash_Course_Fee * (12.36 / 100);

		}

		else {

			Fees = (double) Certification.Crash_Course_Fee + (Certification.Crash_Course_Fee * (12.36 / 100));

		}

		return Fees;

	}

}
