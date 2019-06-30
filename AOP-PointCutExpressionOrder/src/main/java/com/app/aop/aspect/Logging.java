package com.app.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class Logging extends AspectInterface
{
	@Before("forDAOPackageNotSetterGetter()")
	public void logging()
	{
		System.out.println("\n\n=====> Logging: doing logging");
	}
}
