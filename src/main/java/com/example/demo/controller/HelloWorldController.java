/*
 * Copyright (c) 2023 OceanBase.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
