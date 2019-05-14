package com.jiuxian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaRibbonClientOrder2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRibbonClientOrder2Application.class, args);
    }

}
