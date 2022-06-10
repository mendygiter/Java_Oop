package com.codingdojo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class RootController {
    @GetMapping("")
    public String home() {
        return "Welcome!";
    }

    @GetMapping("/today")
    public String today () {
        return "Today you will find luck in all your endouvers!";
    }

    @GetMapping("/tomorrow")
    public String tomorrow() {
        return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
    }
}
