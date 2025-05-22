package com.bankingapp.bankingapp.logindto;

public class CredentialsDto {

	private Long cust_id;
	private String cust_name;
	private String password;
	private double Balance;

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public CredentialsDto(Long cust_id, String cust_name, String password, double balance) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.password = password;
		Balance = balance;
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

	@Override
	public String toString() {
		return "CredentialsDto [cust_id=" + cust_id + ", cust_name=" + cust_name + " Password= ]";
	}

}
