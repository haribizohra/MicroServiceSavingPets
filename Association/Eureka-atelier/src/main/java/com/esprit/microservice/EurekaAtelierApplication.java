package com.esprit.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaAtelierApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaAtelierApplication.class, args);
	}

}
