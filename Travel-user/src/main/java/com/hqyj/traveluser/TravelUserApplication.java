package com.hqyj.traveluser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



@EnableEurekaClient
@SpringBootApplication

public class TravelUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravelUserApplication.class, args);
    }
}
