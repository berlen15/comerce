package com.comerce.comerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EntityScan("com/comerce/comerce/entity")
@SpringBootApplication
public class ComerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComerceApplication.class, args);
	}

}
