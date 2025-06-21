package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Print1Application {

	public static void main(String[] args) { 
		System.out.println("Helo ");
		SpringApplication.run(Print1Application.class, args);
		System.out.println("Welcome to spring ");
	}

}
