package com.jiuxian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix
@EnableCircuitBreaker
@SpringBootApplication
@EnableEurekaClient
public class EurekaRibbonHystrixTurbineClientOrder2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRibbonHystrixTurbineClientOrder2Application.class, args);
    }

}
