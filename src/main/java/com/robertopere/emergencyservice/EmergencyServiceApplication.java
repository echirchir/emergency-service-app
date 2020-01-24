package com.robertopere.emergencyservice;

import com.robertopere.emergencyservice.repository.EmergencyRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = EmergencyRepository.class)
public class EmergencyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmergencyServiceApplication.class, args);
	}

}
