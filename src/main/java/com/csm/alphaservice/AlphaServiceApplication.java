package com.csm.alphaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class AlphaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlphaServiceApplication.class, args);
    }
    @Bean
    public RestTemplate restTemplate(){
////
        return new RestTemplate();
    }

}
