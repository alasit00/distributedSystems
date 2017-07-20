package com.restclient.restclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ClientController {

    private final Logger logger = LoggerFactory.getLogger(ClientController.class);

    @PostMapping("/WeatherData/NewData/")
    public ResponseEntity<?> login(@RequestBody WeatherData weatherdata) {

        logger.debug("weatherdata : {}", weatherdata);

        //validate login here

        return new ResponseEntity("Successfully requested", new HttpHeaders(), HttpStatus.OK);

    }

}
