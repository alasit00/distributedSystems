package com.restclient.restclient;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestclientApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(RestclientApplication.class, args);
		
		String API_URL = "http://localhost:8080";
		
		RestTemplate template = new RestTemplate();
		String cityname = "Göppingen";
        double temperature = 26.2;
        int pressure = 1012;
        int humidity = 80;
        
		String result = template.postForObject(API_URL + "/NewData/add/"+ cityname +"?temperature=" + temperature + "&pressure=" + pressure + "&humidity=" + humidity, null, String.class);
		System.out.println(result);
	}
}
