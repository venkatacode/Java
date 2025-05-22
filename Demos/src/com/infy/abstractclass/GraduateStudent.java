package com.infy.abstractclass;

public class GraduateStudent extends Student {
	// code here
	public GraduateStudent(String studentName) {
		super(studentName);
	}

	@Override
	public void generateresult() {
		//int totalscore = 0;
		double average=calculateAverage();

		if (average >= 60) {
			setResult("Pass");
		} else {
			setResult("fail");
		}
	}
}
