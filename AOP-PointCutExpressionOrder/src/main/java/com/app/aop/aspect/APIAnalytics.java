package com.app.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(-3)
public class APIAnalytics extends AspectInterface
{
	@Before("forDAOPackageNotSetterGetter()")
	public void apiAnalytics()
	{
		System.out.println("\n\n====> API Analytics: Dong API Analyzing");
	}
}
