package com.example.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DBConnectionAspect {

	@Before("execution(* *.getConnection())")
	public void beforeAdvice(){
		System.out.println("Running before Advice : DBConnectionAspect");
	}
	@After("execution(* *.getConnection())")
	public void afterAdvice(){
		System.out.println("Running after Advice : DBConnectionAspect");
	}
}
