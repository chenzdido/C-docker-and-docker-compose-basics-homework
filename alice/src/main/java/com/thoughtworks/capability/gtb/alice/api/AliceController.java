package com.thoughtworks.capability.gtb.alice.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AliceController {

    RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/hello")
    public String hello() {
       return restTemplate.getForEntity("http://bob:8081/hello",String.class).getBody();
    }
}
