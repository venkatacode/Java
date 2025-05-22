package com.bankingapp.bankingapp.credentialscreatedto;

public class CredentialsCreateDto {

	private String cust_name;
	private String password;
	public CredentialsCreateDto() {
		super();
	}
	public CredentialsCreateDto(String cust_name, String password) {
		super();
		this.cust_name = cust_name;
		this.password = password;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
