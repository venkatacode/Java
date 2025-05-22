package com.infy.service;

import com.infy.exception.InfyBankException;

public interface CustomerService {

	Integer updateCityOfCustomer(Integer customerId, String city) throws InfyBankException;

	Integer deleteCustomer() throws InfyBankException;

}
