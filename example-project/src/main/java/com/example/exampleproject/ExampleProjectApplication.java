package com.example.exampleproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class})
public class ExampleProjectApplication {

	public static void main(String[] args) {
			String test = "";
		SpringApplication.run(ExampleProjectApplication.class, args);
	}

}
