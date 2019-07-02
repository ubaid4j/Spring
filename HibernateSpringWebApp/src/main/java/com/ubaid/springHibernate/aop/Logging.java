package com.ubaid.springHibernate.aop;

import org.aspectj.lang.annotation.Pointcut;

public abstract class Logging
{
	//for dao package
	@Pointcut("execution(* com.ubaid.springHibernate.dao.*.*(..))")
	public void daoPackage() {}
	
	@Pointcut("execution(* com.ubaid.springHibernate.controller.*.*(..))")
	public void controllerPackage() {}
	
	@Pointcut("execution(* com.ubaid.springHibernate.controller.*.*(..))")
	public void servicePackage() {}
	
	@Pointcut("daoPackage() || controllerPackage() || servicePackage()")
	public void appFlow() {}
}
