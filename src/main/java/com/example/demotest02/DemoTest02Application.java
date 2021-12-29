package com.example.demotest02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoTest02Application {
	
	@GetMapping("/")
	public String home() {
		return "Welcome to AWS!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoTest02Application.class, args);
	}

}
