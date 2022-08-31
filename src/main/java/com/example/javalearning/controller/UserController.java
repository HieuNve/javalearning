package com.example.javalearning.controller;

import com.example.javalearning.dto.UserDto;
import com.example.javalearning.entity.UserEntity;
import com.example.javalearning.repository.UserRepository;
import com.example.javalearning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/account")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @GetMapping("/api/v1/accounts")
    public UserService getUserService() {
        return (UserService) userService.getUsers();
    }

    @GetMapping("/api/v1/account")
    public UserEntity getUserInformation(@RequestParam Long id) {
        return userRepository.findAllById(id);
    }

    @PostMapping("/api/v1/account")
    public UserDto AddUser(@RequestBody UserDto userDto) {
        return userService.addUser(userDto);
    }
}
