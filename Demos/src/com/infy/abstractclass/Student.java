package com.infy.abstractclass;

public abstract class Student {

	private String name;
	private int[] test;
	private String result;

	public String getName() {
		return name;
	}

	public Student(String studentName) {
		this.name = studentName;
		this.test = new int[4];
		this.result = "NA";
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getTest() {
		return test;
	}

	public void setTest(int[] test) {
		this.test = test;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	// code here
	abstract public void generateresult();

	public void setTestScore(int testNumber, int testScore) {
		if (testNumber >= 0 &&  testNumber <= 3) {
			test[testNumber ] = testScore;
		}

	}

	public double calculateAverage() {
		int totalscore = 0;

		for (int score : test) {
			totalscore = totalscore + score;
		}
		double average=(double) totalscore / test.length;
		return average;
	}
}

class Tester {
	public static void main(String[] args) {
		// code here

		UndergraduateStudent ug = new UndergraduateStudent("Mehul");
		ug.setTestScore(0, 70);
		ug.setTestScore(1, 69);
		ug.setTestScore(2, 71);
		ug.setTestScore(3, 55);
		ug.generateresult();
		System.out.println("Name of the Student:" + ug.getName() +"\nFinal Result was:"+ ug.getResult()+"\n");
		

		GraduateStudent g = new GraduateStudent("Ajay");
		g.setTestScore(0, 70);
		g.setTestScore(1, 69);
		g.setTestScore(2, 90);
		g.setTestScore(3, 55);
		g.generateresult();
		System.out.println("Name of the Student:"+ g.getName()+ "\nFinal Result was:"+ g.getResult());

	}
}
