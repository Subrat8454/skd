package com.skd.skd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SkdApplication {

	public static void main(String[] args) {
		String name = "mike";
		int x =100;
		int y = 200;
		double z = 10.3;
		boolean isPresent=false;
		SpringApplication.run(SkdApplication.class, args);
	}

}
