package com.jiuxian.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.time.LocalDateTime;

/**
 * Author: jiuxian
 * Date: 2019-03-12 22:48:00
 * Comment:
 */

@RestController
@RequestMapping(value = "/order")
public class HelloController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/hello")
    public String hello() {
        System.out.println("Order1 被访问了");
        return "hello I'm order1 ::" + LocalDateTime.now();
    }


    @HystrixCommand(fallbackMethod = "hello")
    @GetMapping(value = "/user")
    public String user() {
        return restTemplate.getForObject("http://eureka-client-user/user/hello", String.class);
    }

}
