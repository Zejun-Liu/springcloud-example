package com.jiuxian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaRibbonHystrixClientOrder1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRibbonHystrixClientOrder1Application.class, args);
    }

}
