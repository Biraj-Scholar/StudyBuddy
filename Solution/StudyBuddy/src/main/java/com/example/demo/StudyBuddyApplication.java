package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class StudyBuddyApplication {

    private static final Logger log = LoggerFactory.getLogger(StudyBuddyApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(StudyBuddyApplication.class, args);
        log.info("My first Spring Boot App");
    }

}
