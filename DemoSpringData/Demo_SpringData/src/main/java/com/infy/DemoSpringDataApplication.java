package com.infy;

import java.time.LocalDate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infy.entity.Customer;
import com.infy.repository.CustomerRespository;

@SpringBootApplication
public class DemoSpringDataApplication implements CommandLineRunner {

	private static final Log LOGGER = LogFactory.getLog(DemoSpringDataApplication.class);
	@Autowired
	CustomerRespository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringDataApplication.class, args);

	}

	public void run(String... args) throws Exception {

		Customer customer1 = new Customer(2, "monica@infy.com", "Monica", LocalDate.of(1987, 4, 2));
		Customer customer2 = new Customer(3, "allen@infy.com", "Allen", LocalDate.of(1980, 4, 2));

		// save customers
		customerRepository.save(customer1);
		customerRepository.save(customer2);

		// fetch customer by id
		LOGGER.info("Customer fetched by findById(1)");
		LOGGER.info("-------------------------------");
		Customer customer3 = customerRepository.findById(1).get();
		LOGGER.info(customer3);

		// fetching all customers
		LOGGER.info("Customers fetched by findAll()");
		LOGGER.info("-------------------------------");
		Iterable<Customer> customers = customerRepository.findAll();
		customers.forEach(LOGGER::info);
	}

}
