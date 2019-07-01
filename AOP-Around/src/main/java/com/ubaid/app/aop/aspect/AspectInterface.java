package com.ubaid.app.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public abstract class AspectInterface
{
	@Pointcut("execution(* com.ubaid.app.aop.service.FortuneService.getTraficFortune(..))")
	public void fortuneService() {}
}
