package com.packt.sb5be.searchapp.dataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class DataserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataserviceApplication.class, args);
	}
}
