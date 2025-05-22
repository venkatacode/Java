package com.infy.abstractclass;

public class UndergraduateStudent extends Student {
	// code here
	public UndergraduateStudent(String studentName) {
		super(studentName);
	}

	@Override
	public void generateresult() {
		//int totalscore = 0;
		double average = calculateAverage();

		if (average >= 70) {
			setResult("Pass");
		} else {
			setResult("fail");
		}
	}

}
