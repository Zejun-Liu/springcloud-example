package com.jiuxian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableHystrix
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class EurekaFeignHystrixDashboardClientUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaFeignHystrixDashboardClientUserApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

  /*  @Bean
    public IRule robinRule() {
        return new WeightedResponseTimeRule();
    }*/

}
