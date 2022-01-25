package com.dionlan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class RegisteredBooksApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisteredBooksApiApplication.class, args);
		
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(16);
		String result = bCryptPasswordEncoder.encode("asdf");
		System.out.println("My hash " + result);
	}
}