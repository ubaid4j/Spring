package com.ubaid.app.aop.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect
{
	
	@Before("execution(public void addAccount())")
	public void adviceNumber1(JoinPoint joinPoint)
	{
		System.out.println("\n=======> Logging working before addAccount method called\n\n");
	}
}
