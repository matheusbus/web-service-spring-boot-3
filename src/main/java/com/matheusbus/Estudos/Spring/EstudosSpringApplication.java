package com.matheusbus.Estudos.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@PropertySources(value = {
		@PropertySource(ignoreResourceNotFound = false, value = "classpath:application.properties")})
@SpringBootApplication
public class EstudosSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstudosSpringApplication.class, args);
	}

}
