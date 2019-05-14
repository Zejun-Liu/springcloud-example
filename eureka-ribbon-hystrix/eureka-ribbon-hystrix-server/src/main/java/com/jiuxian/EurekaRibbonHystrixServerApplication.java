package com.jiuxian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaRibbonHystrixServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRibbonHystrixServerApplication.class, args);
    }

}
