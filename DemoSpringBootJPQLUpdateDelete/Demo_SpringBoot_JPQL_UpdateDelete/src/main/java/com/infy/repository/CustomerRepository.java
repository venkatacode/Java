package com.infy.repository;


public interface CustomerRepository {

	public Integer updateCityOfCustomer(Integer customerId, String city);

	public Integer deleteCustomer();
	
}
