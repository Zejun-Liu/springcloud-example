package com.jiuxian.service;

import com.jiuxian.config.SecurityUser;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


/**
 * Author: LIU ZEJUN
 * Date: 2019-05-09 16:48:00
 * Comment:
 */

@Service
public class UserServiceImpl implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if ("user".equals(username)) {
            return new SecurityUser("user", "123", "user-role");
        }
        if ("admin".equals(username)) {
            return new SecurityUser("admin", "admin", "admin-role");
        }
        return null;
    }
}
