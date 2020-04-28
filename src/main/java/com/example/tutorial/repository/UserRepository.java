package com.example.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tutorial.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
