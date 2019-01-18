package com.java.engineering.springbootconfigurationprofiles.controller;

import com.java.engineering.springbootconfigurationprofiles.model.ConfigurationPOJO;
import com.java.engineering.springbootconfigurationprofiles.model.SamplePOJO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SampleController {

    private RestTemplate restTemplate;

    @Autowired
    private ConfigurationPOJO myConfig;

    SampleController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping(value = "/api/endpoint1", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getData() {

        System.out.println("SampleController timeout config from properties is::"+myConfig.getTimeout());
        System.out.println("SampleController host config from properties is::"+myConfig.getHost());
        ResponseEntity<SamplePOJO[]> sampleResponse = restTemplate.exchange(myConfig.getHost(), HttpMethod.GET, null, SamplePOJO[].class);

        return ResponseEntity.ok(sampleResponse.getBody());

    }

}
