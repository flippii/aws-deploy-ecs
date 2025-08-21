package com.hello.world.client.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloWorldController {

    @Autowired
    private RestTemplate rest;

    @GetMapping("/")
    public String getHelloWorld() {
        var hello = rest.getForObject("http://hello.corp/hello", String.class);
        var world = rest.getForObject("http://world.corp/world", String.class);
        return hello + " " + world;

    }

}
