package com.codingdojo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping("/home")
    public String home() {

        return "<h1>Hello World<h1>";
    }
};