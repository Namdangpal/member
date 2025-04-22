package com.ilsungprint.itteam.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemberApplication.class, args);
	}

	@GetMapping("/")
    public String hello() {
        return "Hello from Spring boot -dangpal---이번에 병합취소해볼께요 합시다";
    } 
}
