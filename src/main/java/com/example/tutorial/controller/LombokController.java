package com.example.tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tutorial.entity.LombokTest;

@RestController
public class LombokController {
	
	@GetMapping("/lombokTest")
	public String lombokTest() {
		LombokTest vo1 = LombokTest.builder().id(1).name("test1").password("test1").family("dad").family("mom").build();
		LombokTest vo2 = new LombokTest("test2");
		vo2.setId(2);
		
		LombokTest vo3 = new LombokTest("test1");
		vo3.setId(1);
		
		System.out.println(vo1.equals(vo2));
		System.out.println(vo1.equals(vo3));
		return vo1.toString();
	}
}
