package com.example.tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.tutorial.entity.User;
import com.example.tutorial.service.UserService;

@Controller
public class MVCController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/thymeleafTest")
	public ModelAndView thymeleafTest() {
		List<User> userList = userService.selectUserAll();
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("userList", userList);
		mav.setViewName("thymeleaf/thymeleafTest");
		return mav;
	}
}
