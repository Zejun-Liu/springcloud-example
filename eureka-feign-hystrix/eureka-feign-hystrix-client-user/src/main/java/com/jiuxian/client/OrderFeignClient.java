package com.jiuxian.client;

import feign.hystrix.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Author: LIU ZEJUN
 * Date: 2019-05-09 16:24:00
 * Comment:
 * <p>
 * fallback 类需要实现FeignClient 接口
 */

@FeignClient(value = "eureka-client-order", fallback = OrderFeignClientFallback.class, fallbackFactory = OrderFeignClientFallbackFactory.class)
public interface OrderFeignClient {

    @GetMapping(value = "/order/hello")
    String getOrder();

}


@Component
class OrderFeignClientFallback implements OrderFeignClient {

    @Override
    public String getOrder() {
        return "失败了，请稍后重试";
    }
}

@Component
class OrderFeignClientFallbackFactory implements FallbackFactory<OrderFeignClient> {

    @Override
    public OrderFeignClient create(Throwable cause) {
        return new OrderFeignClient() {
            @Override
            public String getOrder() {
                cause.printStackTrace();
                return "失败了，请稍后重试";
            }
        };
    }
}


