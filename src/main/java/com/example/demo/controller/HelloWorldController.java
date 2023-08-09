package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.HelloWorldService;

/**
 * @author gaoda.xy
 * @date 2023/8/9 11:07
 */
@RestController
@Component
@RequestMapping("/hello")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping(value = "/{name:.*}", method = RequestMethod.GET)
    public String sayHello(@PathVariable String name) {
        return helloWorldService.sayHello(name);
    }

}
