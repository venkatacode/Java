package com.infy.service;

import org.springframework.stereotype.Service;

@Service
public class SpringProjService {

	SpringProjService() {
		System.out.println("Hello welcome");
	}
	
	public void show() {
		System.out.println("Inside Service Show method");
	}
}
