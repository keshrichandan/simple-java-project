package com.docker.simple_java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SimpleJavaApplication {

	public static void main(String[] args) {
        System.out.println("today is " + new Date());
        System.out.println("Welcome to the docker!");
		SpringApplication.run(SimpleJavaApplication.class, args);
	}

}
