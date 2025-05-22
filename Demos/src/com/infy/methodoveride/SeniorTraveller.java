package com.infy.methodoveride;

public class SeniorTraveller extends Traveller {
	private int age;
	double total = 0.0;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// code as per class diagram
	public SeniorTraveller(String name, String id, int age) {
		super(name, id);
		this.age = age;
	}

	@Override
	public void calculateFare() {

		if (age < 50) {
			System.out.println("");
		} else if (age >= 50 && age < 60) {
			setFare(getFare() * 0.9);
		} else {
			setFare(getFare() * 0.85);
		}
		setFare(getFare() * 1.1136);
	}

	@Override
	public void displayDetails() {
		System.out.println("Traveller Name:" + getName());
		System.out.println("Traveller Id:" + getId());
		System.out.println("Cost of Travel:" + getFare());
	}
}