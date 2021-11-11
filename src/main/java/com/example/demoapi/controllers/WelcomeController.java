package com.example.demoapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/welcome")
public class WelcomeController {

    @GetMapping //berfungsi menghandle request get
    public String welcome(){
        return "Welcome to spring boot Rest API";
    }
}
