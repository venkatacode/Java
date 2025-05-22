package com.infy.inheritance;

public class ContractEmployee extends Employee {

	public ContractEmployee(int empId, String name, double wage, int hours) {
		super(empId, name);
		this.wage = wage;
		this.hours = hours;
	}

	private double wage;
	private int hours;

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double calculatesalary() {
		double totalsalary = wage * hours;
		setSalary(totalsalary);
		return totalsalary;

	}
}
