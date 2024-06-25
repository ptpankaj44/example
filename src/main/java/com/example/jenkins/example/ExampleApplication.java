package com.example.jenkins.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class ExampleApplication {

	private static Logger log=LoggerFactory.getLogger(ExampleApplication.class);

	@PostConstruct
	public void init() {
		log.info("application started by pankaj ...............");
	}
	
	public static void main(String[] args) {
		log.info("application executed by pankaj...............");
		SpringApplication.run(ExampleApplication.class, args);
	}

}
