package com.bankingapp.bankingapp.login;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Credentials {

	@Id
	private Long cust_id;
	@Column(name = "Customer_name")
	private String cust_name;
	private String password;
	private double Balance;

	public Credentials(Long cust_id, String cust_name, String password, double balance) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.password = password;
		Balance = balance;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public Credentials() {
		super();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getCust_id() {
		return cust_id;
	}

	public void setCust_id(Long cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

}
