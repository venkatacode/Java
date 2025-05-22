package com.infy.methodoveride;

public class Traveller {
	private String name;
	private String id;
	private double fare;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	// code as per class diagram
	public Traveller(String name, String id) {
		this.name = name;
		this.id = id;

	}

	public void calculateFare() {
		fare = fare * 1.1136;
	}

	public void displayDetails() {

		System.out.println("Traveller Name:" + getName());
		System.out.println("Traveller id:" + getId());
		System.out.println("Cost of Travel:" + fare);
	}

}
class Tester {
	public static void main(String[] args) {
		// code here
		Traveller travel = new Traveller(" Priya", " AQW1344321");
		travel.setFare(2000);
		travel.calculateFare();
		travel.displayDetails();
		SeniorTraveller seniortravel = new SeniorTraveller("Joey", " PJAMG7755TY", 70);
		seniortravel.setFare(2000);
		seniortravel.calculateFare();
		seniortravel.displayDetails();
	}
}
