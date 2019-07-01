package com.ubaid.app.aop;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ubaid.app.aop.config.Config;
import com.ubaid.app.aop.service.FortuneService;

public class App
{

	
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(Config.class);
		
		FortuneService fortuneService = context.getBean("fortuneService", FortuneService.class);
//		Logger logger = Logger.getLogger(App.class.getName());
	
		try
		{
			System.out.println(fortuneService.getTraficFortune(true));			
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		context.close();
	}

}
