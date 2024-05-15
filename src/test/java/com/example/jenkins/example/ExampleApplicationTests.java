package com.example.jenkins.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExampleApplicationTests {

	private static Logger log=LoggerFactory.getLogger(ExampleApplicationTests.class);
	@Test
	void contextLoads() {
		log.info("Test are executing");
		assertEquals(true, true);
		
	}

}
