package com.jiuxian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class EurekaFeignClientUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaFeignClientUserApplication.class, args);
    }

/*    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }*/

  /*  @Bean
    public IRule robinRule() {
        return new WeightedResponseTimeRule();
    }*/

}
