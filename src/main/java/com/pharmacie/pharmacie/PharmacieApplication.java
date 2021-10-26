package com.pharmacie.pharmacie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.pharmacie.pharmacie.domain.controllers.ReportConroller;

@SpringBootApplication
@ComponentScan(basePackageClasses = ReportConroller.class)
public class PharmacieApplication {

	public static void main(String[] args) {
		SpringApplication.run(PharmacieApplication.class, args);
	}

	

}
