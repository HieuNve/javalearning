package com.example.javalearning.service;

import com.example.javalearning.dto.UserDto;
import com.example.javalearning.entity.UserEntity;

import java.util.List;

public interface iUserService {

    UserDto addUser(UserDto userDto);
    List<UserEntity> getUsers();
}
