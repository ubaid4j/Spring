package com.ubaid.app.aop.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect
{
	/**
	 * modifier? return class? method(parameters)
	 * so, it will apply to all methods having name addAccount() and return type void
	 */	
//	@Before("execution(public void addAccount())")

	
	/**
	 * it will apply to addAccount() method which is in com.ubaid.app.aop.dao.CustomerDAO class
	 */
//	@Before("execution(public void com.ubaid.app.aop.dao.CustomerDAO.addAccount())")

	/**
	 * it will apply to all methods which are starting from add
	 */
//	@Before("execution(public void add*())")

	
	/**
	 * it will apply to all methods having return type void and name addAccount()
	 */
//	@Before("execution(void addAccount())")

	/**
	 * matching parameter:
	 * * one method of any type and name
	 * .. any number of methods of any type and name
	 * or do fully qualified name for specific method
	 * 
	 * so here we are matching specific parameter
	 */
//	@Before("execution(* addAccount(com.ubaid.app.aop.entity.Account))")

	/**
	 * matching no parameter
	 */
//	@Before("execution(* addAccount())")


	/**
	 * matching two specific parameters
	 */
//	@Before("execution(boolean addAccount(com.ubaid.app.aop.entity.Account, boolean))")

	/**
	 * specific parameter
	 */
//	@Before("execution(* addAccount(com.ubaid.app.aop.entity.Account, boolean, Integer))")

	
	/**
	 * one parameter of any type and name
	 */
//	@Before("execution(* add*(*))")

	
	/**
	 * any method of any parameters and any return type
	 */
	@Before("execution(* *(..))")

	/**
	 * any method of any parameters in the com.ubaid.app.aop.dao package
	 */
//	@Before("execution(* com.ubaid.app.aop.dao.*.*(..))")
	public void adviceNumber1(JoinPoint joinPoint)
	{
		System.out.println("\n\n=======> Logging working before addAccount method called");
	}
}
