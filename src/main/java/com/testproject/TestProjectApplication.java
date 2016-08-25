package com.testproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.testproject.web.MainController;

@SpringBootApplication
public class TestProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(new Object[]{TestProjectApplication.class, MainController.class}, args);;
	}
}
