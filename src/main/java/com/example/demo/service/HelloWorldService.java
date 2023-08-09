package com.example.demo.service;

import org.springframework.stereotype.Service;

/**
 * @author gaoda.xy
 * @date 2023/8/9 11:39
 */
@Service
public class HelloWorldService {

    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }

}
