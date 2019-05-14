package com.jiuxian.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * Author: jiuxian
 * Date: 2019-03-12 22:48:00
 * Comment:
 */

@RestController
@RequestMapping(value = "/order")
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello() {
        System.out.println("Order1 被访问了");
        return "hello I'm order1 ::" + LocalDateTime.now();
    }
}
