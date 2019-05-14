package com.jiuxian.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Author: LIU ZEJUN
 * Date: 2019-05-09 16:24:00
 * Comment:
 */

//@FeignClient(value = "eureka-client-order")
public interface OrderFeignClient {

    @GetMapping(value = "/order/hello")
    String getOrder();
}
