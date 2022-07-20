package com.sachin.PrometheusAPIClient.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
public class PrometheusController {

//    @GetMapping("home")
//    public Object home() {
//        String url = "http://localhost:9090/api/v1/status/walreplay";
//        RestTemplate restTemplate = new RestTemplate();
//        Object result = restTemplate.getForObject(url, Object.class);
//        return result;
//    }

    @GetMapping("/restCountry")
    public ResponseEntity<?> getCountrys() {
        try {
            String uri="http://localhost:9090/api/v1/status/walreplay";
            RestTemplate restTemplate = new RestTemplate();
            Object
                    result = restTemplate.getForObject(uri, Object.class);
            return new ResponseEntity<>(result, HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>("Error!, Please try again", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
