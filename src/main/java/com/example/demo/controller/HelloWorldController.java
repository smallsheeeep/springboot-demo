package com.example.demo.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gaoda.xy
 * @date 2023/8/9 11:07
 */
@RestController
@Component
@RequestMapping("/example")
public class HelloWorldController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String sayHello() {
        return "Hello, World!";
    }

}
