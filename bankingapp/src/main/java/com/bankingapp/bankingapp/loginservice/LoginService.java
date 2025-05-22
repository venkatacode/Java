package com.bankingapp.bankingapp.loginservice;

import java.util.List;
import java.util.Optional;

import com.bankingapp.bankingapp.credentialscreatedto.CredentialsCreateDto;
import com.bankingapp.bankingapp.login.Credentials;
import com.bankingapp.bankingapp.logindto.CredentialsDto;

public interface LoginService {

	CredentialsDto create(CredentialsDto credentialsdto);

	Optional<Credentials> Login(Long cust_id,String Password);

	CredentialsDto deposit(Long cust_id, double amount);

	CredentialsDto withdraw(Long cust_id, double amount);
	
	void Deactivate(Long cust_id);	
	
	void Updatepassword(Long cust_id,String newPassword);
	
	List<Credentials> getAll();
	
}
