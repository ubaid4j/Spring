package com.app.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public abstract class AspectInterface
{
	@Pointcut("execution(* com.app.aop.dao.*.*(..))")
	protected void forDAOPackage() {}
	
	@Pointcut("execution(* com.app.aop.dao.*.get*(..))")
	protected void getter() {}
	
	@Pointcut("execution(* com.app.aop.dao.*.set*(..))")
	protected void setter() {}
	
	@Pointcut("execution(* com.app.aop.dao.*.is*(..))")
	protected void isser() {}
	
	@Pointcut("forDAOPackage() && !(getter() || setter() || isser())")
	protected void forDAOPackageNotSetterGetter() {}
}
