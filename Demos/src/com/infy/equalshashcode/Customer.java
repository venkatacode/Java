package com.infy.equalshashcode;

public class Customer {
	private int customerId;
	private String name;
	private String phone;

	public Customer(int id, String name, String phone) {
		// code here
		this.customerId = id;
		this.name = name;
		this.setPhone(phone);
	}

	public String toString() {
		// Output should be in given format
		return "Customer" + "-" + name + " " + "with Id-" + customerId;
	}

	// code equals and hashCode here
	@Override
	public boolean equals(Object obj) {
		Customer customer = (Customer) obj;
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		return customerId == customer.customerId && name.equals(customer.name);
	}

	@Override
	public int hashCode() {
		int result = customerId;
		result = 31 * result + name.hashCode();
		return result;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}

class Tester {
	public static void main(String[] args) {
		Customer c1 = new Customer(105, "Max", "8574637281");
		Customer c2 = new Customer(109, "Nick", "9453281756");
		Customer c3 = new Customer(109, "Nick", "9453281756");
		System.out.println("Customer c1 equals c2:" + c1.equals(c2));
		System.out.println("Customer c2 equals c3:" + c2.equals(c3));
		System.out.println(c1);
		System.out.println(c2);
	}
}