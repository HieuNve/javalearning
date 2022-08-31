package com.example.javalearning.service;

import com.example.javalearning.converter.NewConveter;
import com.example.javalearning.dto.UserDto;
import com.example.javalearning.entity.UserEntity;
import com.example.javalearning.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements iUserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private NewConveter newConveter;


    @Override
    public UserDto addUser(UserDto userDto) {
        UserEntity userEntity = newConveter.toUserEntity(userDto);
        userEntity = userRepository.save(userEntity);
        return newConveter.toUserDto(userEntity);
    }

    @Override
    public List<UserEntity> getUsers() {
        return userRepository.findAll();
    }
}
