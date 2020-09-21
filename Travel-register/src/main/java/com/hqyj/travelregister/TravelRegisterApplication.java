package com.hqyj.travelregister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TravelRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravelRegisterApplication.class, args);
    }

}
