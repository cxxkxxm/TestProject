package com.testproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.testproject.web.MainController;

@ComponentScan
@Configuration
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {
    SpringApplication.run(new Object[]{Application.class, MainController.class}, args);
  }
}