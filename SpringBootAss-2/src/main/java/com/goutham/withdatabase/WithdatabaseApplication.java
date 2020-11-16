package com.goutham.withdatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.goutham.withdatabase.controller",
		"com.goutham.withdatabase.repository", 
		"com.goutham.withdatabase.Model", 
		"com.goutham.withdatabase.dao"})
public class WithdatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(WithdatabaseApplication.class, args);
	}

}
