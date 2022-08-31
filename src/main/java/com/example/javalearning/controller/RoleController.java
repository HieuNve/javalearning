package com.example.javalearning.controller;

import com.example.javalearning.dto.RoleDto;
import com.example.javalearning.entity.RoleEntity;
import com.example.javalearning.repository.RoleRepository;
import com.example.javalearning.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

    @Autowired
    RoleService roleService;

    @PostMapping( "/api/v1/role")
    public RoleDto AddRole(@RequestBody RoleDto roleDto) {

        return roleService.add(roleDto);
    }
}
