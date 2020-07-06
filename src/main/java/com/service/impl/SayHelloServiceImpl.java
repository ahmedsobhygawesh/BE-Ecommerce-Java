package com.service.impl;

import com.service.SayHelloService;
import org.springframework.stereotype.Service;

@Service
public class SayHelloServiceImpl implements SayHelloService {

    @Override
    public String sayHello() {
        return "Hello";
    }
}
