package com.ubaid.springApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JangiCoachDemo
{
	public static void main(String [] args)
	{
		//context
		AnnotationConfigApplicationContext context
			= new AnnotationConfigApplicationContext(NewJavaConfigFile.class);
		
		Coach jangiCoach = context.getBean("jangiCoach", Coach.class);
		
		System.out.println(jangiCoach.getDailyWorkOut());
		System.out.println(jangiCoach.getDailyFortune());
		
		//close context
		context.close();
	}
}
