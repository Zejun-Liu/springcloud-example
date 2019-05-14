package com.jiuxian.controller;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

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

    @GetMapping(value = "/ami")
    public String ami() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UserDetails userDetails = ((UserDetails) principal);
        String roles = userDetails.getAuthorities().stream().map(GrantedAuthority::getAuthority).collect(Collectors.joining(","));
        String user = userDetails.getUsername();
        return "hello I'm order1，you are " + user + "，roles: " + roles;
    }
}
