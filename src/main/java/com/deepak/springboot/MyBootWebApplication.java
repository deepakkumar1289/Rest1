package com.deepak.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@SpringBootApplication
@EnableWebMvc
public class MyBootWebApplication{
    public static void main( String[] args ){
        SpringApplication.run(MyBootWebApplication.class, args);
    }
    
}
