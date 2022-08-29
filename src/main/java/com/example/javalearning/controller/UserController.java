package com.example.javalearning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/account")
public class UserController {
    @GetMapping("/api/v1/accounts")
    public String getUser(){
        return "Hieu";
    }
}
