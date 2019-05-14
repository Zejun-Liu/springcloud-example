package com.jiuxian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaFeignHystrixClientOrder2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaFeignHystrixClientOrder2Application.class, args);
    }

}
