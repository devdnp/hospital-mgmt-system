package com.devdnp.hms;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.devdnp.hms.*")
public class HospitalMgmtSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalMgmtSystemApplication.class, args);
	}
	@Bean
	ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
