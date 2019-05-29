package com.learning.registration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RegistrationApplication implements ApplicationRunner {
	
	Logger loggerFactory = LoggerFactory.getLogger(RegistrationApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(RegistrationApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		loggerFactory.info("Registration Service Started Successfully");
		
	}
}