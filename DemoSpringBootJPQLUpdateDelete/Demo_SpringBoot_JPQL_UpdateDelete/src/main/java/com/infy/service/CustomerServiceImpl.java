package com.infy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infy.exception.InfyBankException;
import com.infy.repository.CustomerRepository;

@Service(value = "customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Integer updateCityOfCustomer(Integer customerId, String city)
			throws InfyBankException {
		return customerRepository.updateCityOfCustomer(customerId, city);
	}

	@Override
	public Integer deleteCustomer() throws InfyBankException {
		return customerRepository.deleteCustomer();
	}

}
