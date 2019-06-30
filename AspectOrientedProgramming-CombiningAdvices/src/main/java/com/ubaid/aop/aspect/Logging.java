package com.ubaid.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging
{
	@Pointcut("execution(* com.ubaid.aop.dao.*.*(..))")
	public void forDAOPackage() {}
	
	@Pointcut("execution(* com.ubaid.aop.dao.*.get*(..))")
	public void getter() {}
	
	@Pointcut("execution(* com.ubaid.aop.dao.*.set*(..))")
	public void setter() {}
	
	@Pointcut("forDAOPackage() && !(getter() || setter())")
	public void forDAOPackageNoSetterGetter() {}
	
	@Before("forDAOPackageNoSetterGetter()")
	public void logging(JoinPoint joinPoint)
	{
		System.out.println("\n\n====> Loggging: Doing Logging Work");
	}
	
	@Before("forDAOPackageNoSetterGetter()")
	public void analytics(JoinPoint joinPoint)
	{
		System.out.println("\n\n====> Analyzing: Doing Analytical work");
	}
}


