package com.jiuxian.controller;

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
@RequestMapping(value = "/user")
public class HelloController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/hello")
    public String hello() {
        return "hello I'm user ::" + LocalDateTime.now();
    }

    @GetMapping(value = "/order")
    public String order() {
        return restTemplate.getForObject("http://eureka-client-order/order/hello", String.class);
    }

}
