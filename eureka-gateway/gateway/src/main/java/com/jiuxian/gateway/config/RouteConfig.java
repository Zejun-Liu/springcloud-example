package com.jiuxian.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;

/**
 * Author: LIU ZEJUN
 * Date: 2019-05-14 13:11:00
 * Comment:
 */

@Configuration
public class RouteConfig {

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p.path("/get")
                        .filters(f -> f.addRequestHeader("foo", "hello"))
                        .uri("http://localhost:8080")
                )
                .route(p -> p.host("*.hystrix.com")
                        .filters(f -> f.hystrix(config ->
                                config.setName("MyHys").setFallbackUri("forward:/fallback")
                        )).uri("http://localhost:8080")
                )
                .route(p -> p.host("*.hystrix.com").and()
                        .method(HttpMethod.GET)
                        .filters(f -> f.retry(3).setStatus(HttpStatus.BAD_GATEWAY))
                        .uri("http://localhost:8081")
                )
                .build();
    }
}
