package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrintApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrintApplication.class, args);
		System.out.println("Helloo");
	}

}
