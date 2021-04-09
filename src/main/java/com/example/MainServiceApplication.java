package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MainServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainServiceApplication.class, args);
	}
	
	@RequestMapping(value = "/get")
	public String m1() {
		
		
		return "success";
	}
	
	@RequestMapping(value = "/gets")
	public String m2() {
		
		
		return "success";
	}
	

}
