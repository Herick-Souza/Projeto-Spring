package com.GasMonkey.VeiculosServ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class VeiculosServApplication {

	public static void main(String[] args) {
		SpringApplication.run(VeiculosServApplication.class, args);
	}

}
