package com.example.tutorial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tutorial.entity.User;
import com.example.tutorial.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void inserUser(User user) {
		userRepository.save(user);
	}
	
	public List<User> selectUserAll() {
		return userRepository.findAll();
	}
}
