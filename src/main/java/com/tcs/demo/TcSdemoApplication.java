package com.tcs.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TcSdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TcSdemoApplication.class, args);
		
		System.out.println("First Spring App");
	}

}
