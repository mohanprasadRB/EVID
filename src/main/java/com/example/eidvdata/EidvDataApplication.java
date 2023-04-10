package com.example.eidvdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EidvDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(EidvDataApplication.class, args);
        System.out.println("EVID Appn is Running");
    }

}
