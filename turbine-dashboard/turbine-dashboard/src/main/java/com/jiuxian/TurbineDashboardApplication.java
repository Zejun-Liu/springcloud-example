package com.jiuxian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableTurbine
@SpringBootApplication
public class TurbineDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(TurbineDashboardApplication.class, args);
    }

}
