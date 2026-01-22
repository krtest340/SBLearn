package com.example.sprint.boot.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sprint.boot.demo.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
