package com.infy.comparable.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {

	private Integer employeeId;
	private String name;
	private Double salary;

	Employee(Integer employeeId, String name, Double salary) {
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}

	// Below code receives object as argument to compare with the current calling
	// object.
	// It compares employeeId of both the objects and returns the result in integer.
	@Override
	public int compareTo(Employee employee) {
		// Code helps to sort the employeeIds of current object and the object passed in
		// the argument
		if (employeeId == employee.employeeId)
			return 0;
		else if (employeeId > employee.employeeId) {
			return 1;
		} else
			return -1;
	}

	@Override
	public String toString() {
		return this.employeeId + " " + this.name + " " + this.salary;
	}
}

class ComparableDemo {
	public static void main(String[] args) {
		// creating employee objects
		Employee employee1 = new Employee(341, "John", 35000.00);
		Employee employee2 = new Employee(103, "Sam", 30000.00);
		Employee employee3 = new Employee(221, "Albert", 40000.00);

		// Adding employee objects to list
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);

		// Displaying employee objects before sorting
		System.out.println(employeeList);

		// Below sort() method uses compareTo() method to sort the given objects
		Collections.sort(employeeList);

		// Displaying employee objects after sorting
		System.out.println(employeeList);
		System.out.println(employee1.compareTo(employee2));
		System.out.println(employee2.compareTo(employee3));

	}
}
