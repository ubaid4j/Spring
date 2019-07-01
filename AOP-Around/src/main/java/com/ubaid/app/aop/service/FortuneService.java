package com.ubaid.app.aop.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class FortuneService
{
	public String getTraficFortune()
	{
		String fortune = "Trafic is on good move, Wish you best luck";
		
		try
		{
			TimeUnit.SECONDS.sleep(3);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		return fortune;
	}
	
	public String getTraficFortune(boolean flag)
	{
		if(flag)
			throw new RuntimeException("--------------boom boom boom accident--------------");
		return getTraficFortune();
	}
}
