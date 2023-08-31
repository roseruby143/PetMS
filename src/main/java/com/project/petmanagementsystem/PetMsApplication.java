package com.project.petmanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetMsApplication {

	public static void main(String[] args) {
		System.setProperty("spring.config.location","application.properties");
		SpringApplication.run(PetMsApplication.class, args);
	}

}
