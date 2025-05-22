package com.infy.service;

import java.util.List;

import com.infy.exception.InfyBankException;


public interface CustomerService {

	public List<Object[]> getCustomerCountForCities() throws InfyBankException;
	
}
