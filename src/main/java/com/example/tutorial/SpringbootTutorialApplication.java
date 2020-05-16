package com.example.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringbootTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTutorialApplication.class, args);
	}

}
