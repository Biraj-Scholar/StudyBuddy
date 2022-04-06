package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class StudyBuddyApplication {
	
	private static final Logger log = LoggerFactory.getLogger(StudyBuddyApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(StudyBuddyApplication.class, args);
		
		log.info("My first Spring Boot App");
	}

}
