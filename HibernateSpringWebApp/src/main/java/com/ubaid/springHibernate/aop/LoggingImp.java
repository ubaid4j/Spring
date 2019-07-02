package com.ubaid.springHibernate.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingImp extends Logging
{
	/**
	 * this is before check aspect will show the method name and its argumetns
	 */
	@Before("appFlow()")
	public void beforeLogging(JoinPoint joinPoint)
	{
		MethodSignature sig = (MethodSignature) joinPoint.getSignature();
		System.out.println("\n\n=====>@Before Method Name: " + sig.toShortString());
		
		Object[] args = joinPoint.getArgs();
		
		System.out.print("=====>@Before  Arguments: ");
		for(Object object : args)
		{
			System.out.print(object + "\t");
		}
		
		System.out.println("\n");
	}
	
	/**
	 * this is after return aspect and it will show the same method name 
	 * and the returing object
	 */
	@AfterReturning(pointcut="appFlow()", returning="object")
	public void afterLogging(JoinPoint joinPoint, Object object)
	{
		MethodSignature sig = (MethodSignature) joinPoint.getSignature();
		System.out.println("\n\n======>@After   Method Name: " + sig.toShortString());
		System.out.println("======>@After  Returing Result: " + object);
	}
}
