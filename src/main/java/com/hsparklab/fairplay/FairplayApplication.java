package com.hsparklab.fairplay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class FairplayApplication {

	public static void main(String[] args) {
		SpringApplication.run(FairplayApplication.class, args);
	}

}
