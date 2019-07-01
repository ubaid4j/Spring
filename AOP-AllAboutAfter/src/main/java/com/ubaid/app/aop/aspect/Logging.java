package com.ubaid.app.aop.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.ubaid.app.aop.entity.Account;

@Aspect
@Component
public class Logging extends AspectInterface
{
	
	/**
	 * AfterReturning: when method return to caller and with out exception then this method will call
	 * 
	 * @param joinPoint
	 * @param accountLists
	 */
	@AfterReturning(pointcut="findAccount()", returning="accountLists")
	public void loggingONFindAccounts(JoinPoint joinPoint, List<Account> accountLists)
	{
		System.out.println("\n\n=====> In After Returing: List of Accoutns: " + accountLists);
		
		//now we want post processing data
		//capitalize every account title
		
		convertToUpperCaseAccountTitle(accountLists);
	}

	/**
	 * When an exception occur then, this method will be called
	 * @param joinPoint
	 * @param exp
	 */
	@AfterThrowing(pointcut="findAccount()", throwing="exp")
	public void loggingAfterThrowing(JoinPoint joinPoint, Throwable exp)
	{
		System.out.println("\n\n====>In AfterThrowing Logging: " + exp);
	}
	
	@After("findAccount()")
	public void loggingAfterSuccessOrFailure(JoinPoint joinPoint)
	{
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		String method = methodSignature.toShortString();
		
		System.out.println("\n\n=====> In After Logging: " + method);
	}
	
	
	private void convertToUpperCaseAccountTitle(List<Account> accountLists)
	{
		for(Account account : accountLists)
		{
			account.setName(account.getName().toUpperCase());
		}
	}
}
