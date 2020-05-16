package com.example.tutorial.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AopTest {
	
	//@Pointcut("execution(* com.example.tutorial.controller.AopController.*(..))")
	//public void setPointCut() {}
	
	@Before("execution(* com.example.tutorial.controller.AopController.aop*(..))")
	public void beforeMethod(JoinPoint jp) {
		System.out.println("beforeMethod() called...");
		System.out.println(jp.getArgs()[0]);
		System.out.println(jp.getArgs()[1]);
	}
	
	@After("execution(* com.example.tutorial.controller.AopController.aop*(..))")
	public void afterMethod(JoinPoint jp) {
		System.out.println("afterMethod() called...");
	}
	
	@AfterReturning(pointcut="execution(* com.example.tutorial.controller.AopController.aop*(..))", returning="result")
	public void afterReturningMethod(JoinPoint jp, Object result) {
		System.out.println("afterReturningMethod() called...");
		System.out.println("result : "+result);
	}
	
	@AfterThrowing(pointcut="execution(* com.example.tutorial.controller.AopController.aop*(..))", throwing="exception")
	public void afterThrowingMethod(JoinPoint jp, Exception exception) {
		System.out.println("afterThrowingMethod() called...");
		System.out.println("error message : "+exception.getMessage());
	}
	
	@Around("execution(* com.example.tutorial.controller.AopController.aop*(..))")
	public Object aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("aroundMethod() before called...");
		
		Object result = pjp.proceed();
		
		System.out.println("aroundMethod() after called...");
		
		return result;
	}
}
