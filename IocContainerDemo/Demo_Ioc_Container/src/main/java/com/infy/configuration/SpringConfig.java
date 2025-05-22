package com.infy.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import com.infy.bean.WelcomeBean;


@Configuration
public class SpringConfig {
	
	@Bean
	public WelcomeBean welcomeBean() {
		return new WelcomeBean();
	}

}