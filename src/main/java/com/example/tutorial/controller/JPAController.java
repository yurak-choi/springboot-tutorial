package com.example.tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.tutorial.entity.User;
import com.example.tutorial.service.UserService;

@RestController
public class JPAController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/test")
	public String test() {
		return "Hello World";
	}
	
	@GetMapping("/insertUser")
	public String insertUser(@RequestParam String name, @RequestParam String email) {
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		userService.inserUser(user);
		return "success";
	}
	
	@GetMapping("/selectUserAll")
	public List<User> selectUserAll() {
		return userService.selectUserAll();
	}
}
