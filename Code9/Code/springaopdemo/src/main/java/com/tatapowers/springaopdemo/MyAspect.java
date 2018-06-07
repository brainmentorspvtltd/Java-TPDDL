package com.tatapowers.springaopdemo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class MyAspect {
	private long startTime;
	private long endTime ; 
	//within("com.tatapowers.*")
	@Before("execution(* *.print(..))")
	public void start() {
		startTime = System.currentTimeMillis();
	}
	@After("execution(* *.print*(..))")
	public void end() {
		endTime = System.currentTimeMillis();
		System.out.println("Total Time Taken "+(endTime-startTime)+" ms");
	}
}
