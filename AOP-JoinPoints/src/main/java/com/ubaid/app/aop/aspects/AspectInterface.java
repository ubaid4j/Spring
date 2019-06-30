package com.ubaid.app.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public abstract class AspectInterface
{
	//all doa packages
	@Pointcut("execution(* com.ubaid.app.aop.dao.*.*(..))")
	protected void allDAO() {}
	
	//all getters 
	@Pointcut("execution(* com.ubaid.app.aop.dao.*.get*(..))")
	protected void getter() {}
	
	//all setters
	@Pointcut("execution(* com.ubaid.app.aop.dao.*.set*(..))")
	protected void setter() {}
	
	//all doa package but no getter and setters
	@Pointcut("allDAO() && !(getter() || setter())")
	protected void allDAONoSetterGetter() {}
}
