package com.demo.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureHelloWorldApplication {

	@GetMapping("/hi")
	public String sayHello(){
		return "Welcome to Azure";
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureHelloWorldApplication.class, args);
	}

}
