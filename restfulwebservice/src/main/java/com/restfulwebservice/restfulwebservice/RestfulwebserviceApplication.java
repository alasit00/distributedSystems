package com.restfulwebservice.restfulwebservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestfulwebserviceApplication {

	@Autowired
	private WeatherDataRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(RestfulwebserviceApplication.class, args);
	}
	
	/*public void run(String... args) throws Exception {

		
		for (WeatherData weatherdata : repository.findAll()) {
			System.out.println(weatherdata);
		}
		System.out.println();

		/*for (WeatherData weatherdata : repository.findByCityname("Stuttgart")) {
			System.out.println(weatherdata);
		}

	}*/
}
