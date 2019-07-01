package com.ubaid.app.aop.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logging extends AspectInterface
{
//	Logger logger = Logger.getLogger(getClass().getName());
	
	/**
	 * will apply on methods in the FortuneService
	 * simply proceeding the method and handling exception
	 * 
	 * @param pJoinPoint
	 * @return
	 * @throws Throwable
	 */
	@Around("fortuneService()")
	public Object aroundLogging(ProceedingJoinPoint pJoinPoint) throws Throwable
	{
		System.out.println("\n\n=====>Around Logging: Initiating");
		long begin = System.currentTimeMillis();
		
		Object result = null;
		
		try
		{
			result = pJoinPoint.proceed();			
		}
		catch(Exception exp)
		{
			result = exp.getMessage();
		}
		long end = System.currentTimeMillis();
		long duration = end - begin;
		System.out.println("\n\n=====>Total Duration: " + duration / 1000 + " secs");
		
		System.out.println("\n\n");
		return result;
	}
}
