package com.jiuxian.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

/**
 * Author: LIU ZEJUN
 * Date: 2019-03-13 09:53:00
 * Comment:
 */

@Configuration
public class RouteConfig {

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/v1/1/hello").and()
//                        .host("dev.gateway:8888").and()
                        .method(HttpMethod.GET)
                        .filters(f -> f.stripPrefix(1))
                        .uri("http://192.168.1.111:8091")
                ).build();
    }
}
