package com.example.simplerestservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import com.example.simplerestservice.controller.GreetingController;
@SpringBootApplication
@ComponentScan(basePackageClasses=GreetingController.class)
public class SimpleRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleRestServiceApplication.class, args);
	}

}
