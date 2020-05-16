package com.example.tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AopController {

	@GetMapping("/aopTest")
	public String aopTest(@RequestParam boolean flag, @RequestParam String str) {
		if(flag)
			throw new RuntimeException("test Exception");
		
		return "Hello! Spring AOP";
	}
}
