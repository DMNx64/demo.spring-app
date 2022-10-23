package com.dmnx64.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@CrossOrigin
public class SpringAppApplication {

	@RequestMapping("/health")
	public String health() {
	  return "OK";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAppApplication.class, args);
	}

}
