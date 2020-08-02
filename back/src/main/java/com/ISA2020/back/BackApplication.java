package com.ISA2020.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@EntityScan( basePackages = {"com.ISA2020.back.model"} )
public class BackApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackApplication.class, args);
		System.out.println("proso");
	}

}
