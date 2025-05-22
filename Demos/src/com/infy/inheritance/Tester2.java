package com.infy.inheritance;

public class Tester2 {
	public static void main(String args[]) {
		PermanentEmployee pemp = new PermanentEmployee(101, "Anil", 7000, 1500, 3);
		pemp.calculatesalary();
		System.out.println("Permanent Employee :" + pemp.getSalary());
		ContractEmployee cemp = new ContractEmployee(102, "Ankit", 500, 10);
		cemp.calculatesalary();
		System.out.println("ContractEmployee:" + cemp.getSalary());
	}
}
