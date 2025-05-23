package com.infy.assignment6;

public class Tester {
	public static void main(String[] args) {
		RRTechnicalCertification RRT = new RRTechnicalCertification("Rakesh", "J2EE", 85);
		RegularCourseCertification RCC = new RegularCourseCertification("Rakesh", "J2EE", 85, 5);
		CrashCourseCertification CCC = new CrashCourseCertification("Roshan", "Angular", 71);
		CrashCourseCertification CCC1 = new CrashCourseCertification("Roshan", "Angular", 60);
		CrashCourseCertification CCC2 = new CrashCourseCertification("Roshan", "Angular", 69);
		CrashCourseCertification CCC3 = new CrashCourseCertification("Roshan", "Angular", 69);

		RegularCourseCertification RCC1 = new RegularCourseCertification("Rakesh", "course", 69, 5);
		RegularCourseCertification RCC2 = new RegularCourseCertification("Rakesh", "course2", 70, 5);
		RegularCourseCertification RCC3 = new RegularCourseCertification("Rakesh", "J2EE", 54, 5);

//    .setRegistrationId(1001);

		System.out.println("Regular Course Registration Details");
		System.out.println("***********************************");
		System.out.println("Student Name" + RCC.getStudentName());
		System.out.println("Course Name" + RCC.getCourseName());
		System.out.println("Course Duration" + RCC.getCourseDuration());
		RCC.generateRegistrationId();
		System.out.println("Registration Id" + RCC.getRegistrationId());
		System.out.println("Total Fee" + RCC.calculateFee());

		System.out.println("Regular Course Registration Details");
		System.out.println("***********************************");
		System.out.println("Student Name" + RCC1.getStudentName());
		System.out.println("Course Name" + RCC1.getCourseName());
		System.out.println("Course Duration" + RCC1.getCourseDuration());
		RCC1.generateRegistrationId();
		System.out.println("Registration Id" + RCC1.getRegistrationId());
		System.out.println("Total Fee" + RCC1.calculateFee());

		System.out.println("Regular Course Registration Details");
		System.out.println("***********************************");
		System.out.println("Student Name" + RCC2.getStudentName());
		System.out.println("Course Name" + RCC2.getCourseName());
		System.out.println("Course Duration" + RCC2.getCourseDuration());
		RCC2.generateRegistrationId();
		System.out.println("Registration Id" + RCC2.getRegistrationId());
		System.out.println("Total Fee" + RCC2.calculateFee());

		System.out.println("Regular Course Registration Details");
		System.out.println("***********************************");
		System.out.println("Student Name" + RCC3.getStudentName());
		System.out.println("Course Name" + RCC3.getCourseName());
		System.out.println("Course Duration" + RCC3.getCourseDuration());
		RCC3.generateRegistrationId();
		System.out.println("Registration Id" + RCC3.getRegistrationId());
		System.out.println("Total Fee" + RCC3.calculateFee());

		System.out.println("Crash Course Registration Details");
		System.out.println("***********************************");
		System.out.println("Student Name" + CCC.getStudentName());
		System.out.println("CourseName" + CCC.getCourseName());
		System.out.println("Course Duration: 2");
		CCC.generateRegistrationId();
		System.out.println("RegistrationId" + CCC.getRegistrationId());
		System.out.println("Total Fee" + CCC.calculateFee());

		System.out.println("Crash Course Registration Details");
		System.out.println("***********************************");
		System.out.println("Student Name" + CCC1.getStudentName());
		System.out.println("CourseName" + CCC1.getCourseName());
		System.out.println("Course Duration: 2");
		CCC1.generateRegistrationId();
		System.out.println("RegistrationId" + CCC1.getRegistrationId());
		System.out.println("Total Fee" + CCC1.calculateFee());

		System.out.println("Crash Course Registration Details");
		System.out.println("***********************************");
		System.out.println("Student Name" + CCC2.getStudentName());
		System.out.println("CourseName" + CCC2.getCourseName());
		System.out.println("Course Duration: 2");
		CCC2.generateRegistrationId();
		System.out.println("RegistrationId" + CCC2.getRegistrationId());
		System.out.println("Total Fee" + CCC2.calculateFee());

		CCC3.generateRegistrationId();
		System.out.println("RegistrationId" + CCC3.getRegistrationId());
		System.out.println("Total Fee" + CCC3.calculateFee());

	}

}
