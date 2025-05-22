package com.infy;



import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import com.infy.controller.CustomerLoginController;
import com.infy.dto.CustomerLoginDTO;
import com.infy.exception.InfyBankException;


@SpringBootApplication
public class DemoSpringBootLoggingApplication implements CommandLineRunner {
	
	private static final Log LOGGER = LogFactory.getLog(DemoSpringBootLoggingApplication.class);

	@Autowired
	CustomerLoginController customerLoginController;
	
	@Autowired
	Environment environment;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootLoggingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		try{

			CustomerLoginDTO customerLogin = new CustomerLoginDTO();
			customerLogin.setLoginName("harry");
			customerLogin.setPassword("harry123");

			customerLoginController.authenticateCustomer(customerLogin);
			
			LOGGER.info(environment.getProperty("SUCCESS"));
		}catch(InfyBankException exception){
			LOGGER.error(environment.getProperty(exception.getMessage()));
		}
		
	}

}

