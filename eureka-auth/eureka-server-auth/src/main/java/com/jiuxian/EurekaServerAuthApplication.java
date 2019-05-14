package com.jiuxian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerAuthApplication.class, args);
    }

}
