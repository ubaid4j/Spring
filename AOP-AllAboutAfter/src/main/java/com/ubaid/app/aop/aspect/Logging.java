package com.ubaid.app.aop.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
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
		System.out.println("List of Accoutns: " + accountLists);
		
		//now we want post processing data
		//capitalize every account title
		
		convertToUpperCaseAccountTitle(accountLists);
	}

	private void convertToUpperCaseAccountTitle(List<Account> accountLists)
	{
		for(Account account : accountLists)
		{
			account.setName(account.getName().toUpperCase());
		}
	}
}
