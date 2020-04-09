package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Value("${com.example.title}")
	private String title;
	@Value("${com.example.description}")
	private String description;

	@Test
	void contextLoads() {
		getProperties();
	}

	public void getProperties() {
		System.out.println(" Title = " + title);
		System.out.println(" Description = " + description);
	}
}
