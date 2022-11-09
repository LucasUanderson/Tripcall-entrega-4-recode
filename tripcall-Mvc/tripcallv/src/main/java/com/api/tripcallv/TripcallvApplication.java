package com.api.tripcallv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class TripcallvApplication {

	public static void main(String[] args) {
		SpringApplication.run(TripcallvApplication.class, args);
		  System.out.println(new BCryptPasswordEncoder().encode("senha123"));
	}

}
