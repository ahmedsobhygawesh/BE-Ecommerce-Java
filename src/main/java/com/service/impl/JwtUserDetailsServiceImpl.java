package com.service.impl;

import java.util.ArrayList;

import com.model.UserModel;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Service
public class JwtUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserService userService;
    @Override
    public UserDetails loadUserByUsername(String mobile) throws UsernameNotFoundException {

        UserModel user = userService.findUserByMobile(mobile);
        if (user != null) {
            return new User(user.getMobile(), user.getPassword(), new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found with username: " + user.getUserName());
        }
    }


}