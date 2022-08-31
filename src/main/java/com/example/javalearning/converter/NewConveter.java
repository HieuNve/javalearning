package com.example.javalearning.converter;

import com.example.javalearning.dto.RoleDto;
import com.example.javalearning.dto.UserDto;
import com.example.javalearning.entity.RoleEntity;
import com.example.javalearning.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class NewConveter {

    public RoleEntity toEntity(RoleDto roleDto){
        RoleEntity roleEntity = new RoleEntity();
        roleEntity.setName(roleDto.getName());
        roleEntity.setCreateBy(roleDto.getCreateBy());
        roleEntity.setCreateDate(roleDto.getCreateDate());
        roleEntity.setEditBy(roleDto.getEditBy());
        roleEntity.setEditDate(roleDto.getEditDate());
        return  roleEntity;
    }

    public RoleDto toDto(RoleEntity roleEntity){
        RoleDto roleDto = new RoleDto();
        roleDto.setId(roleEntity.getId());
        roleDto.setName(roleEntity.getName());
        roleDto.setCreateBy(roleEntity.getCreateBy());
        roleDto.setCreateDate(roleEntity.getCreateDate());
        roleDto.setEditBy(roleEntity.getEditBy());
        roleDto.setEditDate(roleEntity.getEditDate());
        return roleDto;
    }

    public UserEntity toUserEntity(UserDto userDto){
        UserEntity userEntity = new UserEntity();
        userEntity.setRoleId(userDto.getRoleId());
        userEntity.setUsername(userDto.getUsername());
        userEntity.setPassword(userDto.getPassword());
        userEntity.setCreateBy(userDto.getCreateBy());
        userEntity.setCreateDate(userDto.getCreateDate());
        userEntity.setEditBy(userDto.getEditBy());
        userEntity.setEditDate(userDto.getEditDate());
        return userEntity;
    }

    public UserDto toUserDto(UserEntity userEntity){
        UserDto userDto = new UserDto();
        userDto.setId(userEntity.getId());
        userDto.setRoleId(userEntity.getRoleId());
        userDto.setUsername(userEntity.getUsername());
        userDto.setPassword(userEntity.getPassword());
        userDto.setCreateBy(userEntity.getCreateBy());
        userDto.setCreateDate(userEntity.getCreateDate());
        userDto.setEditBy(userEntity.getEditBy());
        userDto.setEditDate(userEntity.getEditDate());
        return userDto;
    }


}
