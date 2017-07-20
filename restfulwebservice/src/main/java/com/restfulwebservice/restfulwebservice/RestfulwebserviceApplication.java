package com.restfulwebservice.restfulwebservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestfulwebserviceApplication {
	private static final Logger log = LoggerFactory.getLogger(RestfulwebserviceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RestfulwebserviceApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(WeatherDataRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new WeatherData("Stuttgart", 23.0, 1014, 75));
			repository.save(new WeatherData("Berlin", 26.0, 1012, 60));
			repository.save(new WeatherData("Hamburg", 23.0, 1013, 70));
			repository.save(new WeatherData("Köln", 26.0, 1011, 80));
			repository.save(new WeatherData("Heilbronn", 21.0, 1014, 75));

			// fetch all customers
			log.info("WeatherData found with findAll():");
			log.info("-------------------------------");
			for (WeatherData weatherdata : repository.findAll()) {
				log.info(weatherdata.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			WeatherData weatherdata = repository.findOne(1L);
			log.info("WeatherData found with findOne(1L):");
			log.info("--------------------------------");
			log.info(weatherdata.toString());
			log.info("");

			// fetch customers by last name
			log.info("Customer found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			for (WeatherData stuttgart : repository.findByCityname("Stuttgart")) {
				log.info(stuttgart.toString());
			}
			log.info("");
		};
	}
	
}
