package com.altay.altayspringboot;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AltaySpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AltaySpringBootApplication.class, args);
	}

	@Bean
	public ModelMapper getModelMapper()
	{
		return new ModelMapper();
	}
}

