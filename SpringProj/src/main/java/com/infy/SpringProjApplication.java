package com.infy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infy.service.SpringProjService;

@SpringBootApplication
public class SpringProjApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringProjApplication.class, args);
	}
	
	@Autowired
	SpringProjService sDemo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		sDemo.show();
	}
	
}
