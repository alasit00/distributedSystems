package com.restfulwebservice.restfulwebservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("NewData")
public class WeatherDataController {

    WeatherDataRepository repository;
    

    @Autowired
    public WeatherDataController(WeatherDataRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(value = "add/{cityname}", method = RequestMethod.POST)
    public String addPerson(@RequestParam("temperature") double temperature,@RequestParam("pressure") int pressure,@RequestParam("humidity") int humidity,@PathVariable("cityname") String cityname) {
    	WeatherData data = new WeatherData(cityname, temperature, pressure, humidity);
    	repository.save(data);
    	return "redirect:/WeatherData";
    }

}
        
