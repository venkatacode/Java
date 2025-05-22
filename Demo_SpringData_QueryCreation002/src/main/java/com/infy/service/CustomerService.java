package com.infy.service;

import com.infy.exception.InfyBankException;

public interface CustomerService {
	String findNameByEmailId(String emailId);
	void updateCustomerEmailId(String newEmailId, Integer customerId) throws InfyBankException;
	void deleteCustomerByEmailId(String emailId) throws InfyBankException;
}
