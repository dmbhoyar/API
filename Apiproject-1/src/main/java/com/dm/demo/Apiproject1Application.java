package com.dm.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.dm.demo.services"})
public class Apiproject1Application {

	public static void main(String[] args) {
		SpringApplication.run(Apiproject1Application.class, args);
	}

}
