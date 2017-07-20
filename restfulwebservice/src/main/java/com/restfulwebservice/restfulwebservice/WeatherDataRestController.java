package com.restfulwebservice.restfulwebservice;


import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/{cityName}/weatherData")
class WeatherDataRestController {

	private final WeatherDataRepository repository;


	@Autowired
	WeatherDataRestController(WeatherDataRepository repository) {
		this.repository = repository;
	}

	@RequestMapping(method = RequestMethod.GET)
	Collection<WeatherData> readBookmarks(@PathVariable String cityname) {
		return repository.findByCityname(cityname);
	}

	/*@RequestMapping(method = RequestMethod.POST)
	ResponseEntity<?> add(@PathVariable String cityname, @RequestBody WeatherData input) {
	WeatherData data = new WeatherData(input.getCityname(),input.getTemperature(),input.getPressure(),input.getHumidity());	
		return repository.findByCityname(cityname)
				.map(account -> {
					Bookmark result = bookmarkRepository.save(new Bookmark(account,
							input.uri, input.description));

					URI location = ServletUriComponentsBuilder
						.fromCurrentRequest().path("/{id}")
						.buildAndExpand(result.getId()).toUri();

					return ResponseEntity.created(location).build();
				})
				.orElse(ResponseEntity.noContent().build());

	}*/
}
