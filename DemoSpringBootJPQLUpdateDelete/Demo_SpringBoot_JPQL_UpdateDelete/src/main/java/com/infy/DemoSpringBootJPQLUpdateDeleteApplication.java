package com.infy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import com.infy.service.CustomerService;

@SpringBootApplication
public class DemoSpringBootJPQLUpdateDeleteApplication implements CommandLineRunner {

	private static final Log LOGGER = LogFactory.getLog(DemoSpringBootJPQLUpdateDeleteApplication.class);

	@Autowired
	CustomerService service;
	@Autowired
	Environment environment;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootJPQLUpdateDeleteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		updateCityOfEmployee();
		deleteCustomer();
	}

	public void updateCityOfEmployee() {
		try {
			service.updateCityOfCustomer(1002, "Seattle");
			LOGGER.info(environment.getProperty("UserInterface.UPDATE_SUCCESS"));
			LOGGER.info("\n");
		} catch (Exception e) {
			String message = environment.getProperty(e.getMessage(),
					"Some exception occured. Please check log file for more details!!");
			LOGGER.info(message);
		}
	}

	public void deleteCustomer() {
		try {
			Integer deleteCount = service.deleteCustomer();
			LOGGER.info(deleteCount + " " + environment.getProperty("UserInterface.DELETE_SUCCESS"));
			LOGGER.info("\n");
		} catch (Exception e) {
			String message = environment.getProperty(e.getMessage(),
					"Some exception occured. Please check log file for more details!!");
			LOGGER.info(message);
		}
	}
}
