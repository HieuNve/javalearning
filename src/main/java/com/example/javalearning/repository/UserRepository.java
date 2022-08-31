package com.example.javalearning.repository;

import com.example.javalearning.dto.UserDto;
import com.example.javalearning.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository  extends JpaRepository<UserEntity, Long> {
    UserEntity findAllById(Long idLong);
}
