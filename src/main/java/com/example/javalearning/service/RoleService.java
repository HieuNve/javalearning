package com.example.javalearning.service;

import com.example.javalearning.converter.NewConveter;
import com.example.javalearning.dto.RoleDto;
import com.example.javalearning.dto.UserDto;
import com.example.javalearning.entity.RoleEntity;
import com.example.javalearning.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService implements NewService {
    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private NewConveter newConveter;

    @Override
    public RoleDto add(RoleDto roleDto) {
        RoleEntity roleEntity1 = newConveter.toEntity(roleDto);
        roleEntity1 = roleRepository.save(roleEntity1);
        return newConveter.toDto(roleEntity1);
    }

}
