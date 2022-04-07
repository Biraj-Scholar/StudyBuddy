package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudyBuddyApplication {

    private static final Logger log = LoggerFactory.getLogger(StudyBuddyApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(StudyBuddyApplication.class, args);

        log.info("My first Spring Boot App");
    }

    @Bean
    public CommandLineRunner demo(AppUserService userService) {

        return (args) -> {
            AppUser user = new AppUser();
            userService.saveUser(user);

            Role role = new Role();
            userService.saveRole(role);

            userService.addRoleToUser(user.getUserId(), role.getName());
            log.info("Bean is running");

			String userName = "";
			userService.getUser(userName);

			for (AppUser appuser: userService.getAllUser()) {
				log.info(appuser.toString());
			}
        };
    }

}
