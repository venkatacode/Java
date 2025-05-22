package com.infy;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
//import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import 	org.springframework.core.env.Environment;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infy.service.CustomerService;

@SpringBootApplication
public class DemoSpringBootJPQLGroupingApplication implements CommandLineRunner{
	
	private static final Log LOGGER = LogFactory.getLog(DemoSpringBootJPQLGroupingApplication.class);
	@Autowired
	CustomerService service;
	@Autowired
	Environment environment;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootJPQLGroupingApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		getCityWiseCustomerCount();
		
	}
	public void getCityWiseCustomerCount() {
		try {
			List<Object[]> objects =service.getCustomerCountForCities();
			for (Object[] object : objects) {
				LOGGER.info(object[0]+" "+object[1]);
			}
			
			
		} catch (Exception e) {
			String message = environment.getProperty(e.getMessage());
			LOGGER.info(message);
		}		
	}
}
