package com.jiuxian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClientAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientAuthApplication.class, args);
    }

}
