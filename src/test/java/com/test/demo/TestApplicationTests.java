package com.test.demo;

import com.example.demo.service.ExampleService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestApplicationTests {
	private ExampleService exampleService;

	@Test
	void contextLoads() {
		System.out.println(exampleService.wrap("hello"));

	}

}
