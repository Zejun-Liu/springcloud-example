package com.jiuxian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
@SpringBootApplication
@EnableEurekaClient
public class EurekaFeignAuthClientOrder1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaFeignAuthClientOrder1Application.class, args);
    }

}
