package com.esprit.microservice;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.esprit.microservice.entity.Campagne;
import com.esprit.microservice.repository.CampagneRepository;

@SpringBootApplication
@EnableEurekaClient
public class EventApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventApplication.class, args);
	}
	/*
	@Bean
	ApplicationRunner init(CampagneRepository repository) {
		return args ->{
			Stream.of("mariem","sarra","mohamed").forEach(nom -> {
				repository.save(new Campagne(nom));
			});
			repository.findAll().forEach(System.out::println);
			};
		}
		*/

}
