package com.ilsungprint.itteam.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication; 

@SpringBootApplication 
public class MemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemberApplication.class, args);
	}

	/*@GetMapping("/")
    public String hello() {
        return "Hello from Spring Boot!";
    } */
}
