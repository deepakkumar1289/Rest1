package com.deepak.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*@EnableAutoConfiguration
@Configuration
@ComponentScan({"com.deepak.springboot"})*/
@EnableWebMvc
@SpringBootApplication
@EnableTransactionManagement
public class JWebConfig implements WebMvcConfigurer{
	
		}



