package com.java.engineering.springbootconfigurationprofiles;

import com.java.engineering.springbootconfigurationprofiles.model.ConfigurationPOJO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@SpringBootApplication
public class SpringbootConfigurationProfilesApplication {

    @Autowired
    public ConfigurationPOJO myConfig;

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {

        System.out.println("Timeout while initialising RestTemplate is:::"+myConfig.getTimeout());
        return builder
            .setConnectTimeout(Duration.ofMillis(Long.parseLong(myConfig.getTimeout())))
            .build();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootConfigurationProfilesApplication.class, args);
    }

}

