package com.ubaid.app.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.ubaid.app.aop.entity.Account;

@Aspect
@Component
public class Logging extends AspectInterface
{
	@Before("allDAONoSetterGetter()")
	public void logging(JoinPoint joinPoint)
	{
		System.out.println("\n\n=====> Logging: working");
		
		//method signature: 
		MethodSignature sig = (MethodSignature) joinPoint.getSignature();
		System.out.println(sig.getName());
		//getArgs
		
		Object[] args = joinPoint.getArgs();
		
		for(Object obj : args)
		{
			System.out.println(obj);
			if(obj instanceof Account)
			{
				Account acc = (Account) obj;
				System.out.println(acc.getName());
			}
		}
		
	}
}
