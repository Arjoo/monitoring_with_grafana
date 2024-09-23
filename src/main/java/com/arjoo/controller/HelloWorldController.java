package com.arjoo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloWorld")
@Slf4j
public class HelloWorldController {


    @GetMapping
    public String sayHi() {
        log.info("logging hello world message");
        return "Hello world !!";
    }
}
