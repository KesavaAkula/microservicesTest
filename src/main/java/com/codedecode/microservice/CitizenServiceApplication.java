package com.codedecode.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class CitizenServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitizenServiceApplication.class, args);
		System.out.println("Main CitizenApp Main Class");
	}

}
