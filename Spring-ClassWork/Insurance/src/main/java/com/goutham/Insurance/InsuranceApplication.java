package com.goutham.Insurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.goutham.Insurance.controller",
		"com.goutham.Insurance.dao",
		"com.goutham.Insurance.model",
		"com.goutham.Insurance.repository"})
public class InsuranceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsuranceApplication.class, args);
	}

}
