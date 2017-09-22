package com.tdkdev.edu.subdlabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackageClasses = {SubdLabsApplication.class})
public class SubdLabsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubdLabsApplication.class, args);
	}
}
