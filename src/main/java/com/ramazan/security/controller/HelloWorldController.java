package com.ramazan.security.controller;

import com.ramazan.security.configuration.swagger.AuthorizationInfo;
import com.ramazan.security.domain.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @AuthorizationInfo
    @GetMapping("/hello")
    public Person hello() {
        return new Person(1L, "Ramazan", "123");
    }
}
