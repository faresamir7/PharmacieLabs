package com.pharmacie.pharmacie.configs;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pharmacie.pharmacie.repositories.PatientRepository;

@Configuration
public class patientConfig {

	@Bean
	CommandLineRunner commandLineRunner(PatientRepository repo) {
		return args -> {

		};
	}
}
