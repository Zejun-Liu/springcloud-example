package com.jiuxian.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Author: LIU ZEJUN
 * Date: 2019-05-09 15:05:00
 * Comment:
 * 新版的Spring security 会默认开启防csrf攻击，所有的请求都必须携带crsf这个参数，
 * 所以我们需要主动去关闭，在Eureka服务配置
 */

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable();
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/actuator/**", "/eureka").permitAll()
                .anyRequest()
                .authenticated().and().httpBasic();
        super.configure(http);
    }
}
