package com.restclient.restclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestclientApplication {
	private static RestTemplate restTemplate = new RestTemplate();
	private static final String baseURL = "http://localhost:8080/";
	
	public static void main(String[] args) {
		SpringApplication.run(RestclientApplication.class, args);
		
		WeatherData data = new WeatherData("Göppingen", 30.2, 1014, 75);
		data = restTemplate.postForObject(baseURL+"NewData", data, WeatherData.class);
		System.out.println("Added weatherdata: " + data);
		
	}
}
