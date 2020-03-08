package com.johnson.my_pass.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {

    @RequestMapping()
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
