package com.ubaid.app.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Cloud extends AspectInterface
{
	@Before("allDAONoSetterGetter()")
	public void cloudLog()
	{
		System.out.println("\n\n=====> Cloud Logging: Working");
	}
}
