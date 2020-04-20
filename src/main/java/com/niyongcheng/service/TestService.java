package com.niyongcheng.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {
    private final RestTemplate restTemplate;

    @Autowired
    public TestService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public String hiService(String name){
        return restTemplate.getForObject("http://CLOUD-EUREKA-CLIENT/hi?name="+name,String.class);
    }

    public String hiError(String name){
        return "Hi," + name + ", sorry,error";
    }
}
