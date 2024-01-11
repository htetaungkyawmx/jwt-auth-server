package com.example.jwtauthserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwtAuthServerApplication {
//curl -v XPOST -u client:secret "http://localhost:8080/oauth/token?grant_type=password&username=john&password=12345&scope=read"
	public static void main(String[] args) {
		SpringApplication.run(JwtAuthServerApplication.class, args);
	}

}
