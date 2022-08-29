package com.example.javalearning.controller;

import com.example.javalearning.dto.UserDto;
import com.example.javalearning.entity.UserEntity;
import com.example.javalearning.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/account")
public class UserController {
    private UserRepository userRepository;
    @GetMapping("/api/v1/accounts")
    public String getUser(){
        return "Hieu";
    }

    @GetMapping("/api/v1/account")
    public UserEntity getUserInformation(@RequestParam Long id){
        return userRepository.findAllById(id);
    }

    @PostMapping("/api/v1/account")
    public String AddUser(@RequestBody UserDto userDto){
        return "Hieu";
    }
}
