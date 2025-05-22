package com.infy.inheritance;

public class PermanentEmployee extends Employee {

	public PermanentEmployee(int empId, String name, double basicPay, double hra, int experience) {
		super(empId, name);
		this.basicPay = basicPay;
		this.hra = hra;
		this.experience = experience;
	}

	private double basicPay;
	private double hra;
	private int experience;

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
	/*
	 * code here
	 */

	public double calculatesalary() {
		double Component = 0;
		if (getExperience() >= 10) {
			Component = 1.2 * basicPay;

		} else if (getExperience() >= 3 && getExperience() < 5) {
			// salary = getExperience()+setBasicPay(5)+getHra();
			Component = 0.5 * basicPay;

		} else if (getExperience() >= 5 && getExperience() < 10) {
			// salary = getExperience()+setBasicPay(7)+getHra();
			Component = 0.7 * basicPay;

		} else {
			// salary = getExperience()+setBasicPay(0)+getHra();
			Component = 0;

		}
		double totalSalary = Component + basicPay + hra;
		setSalary(totalSalary);
		return totalSalary;
	}
}
