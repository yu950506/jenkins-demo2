package com.dadi01.jenkinsdemo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
    @GetMapping("test")
    public String test() {
        return "Hello Jenkins!";
    }
    @GetMapping("test2")
    public String test2() {
        return "Hello Jenkins2!";
    }
}
