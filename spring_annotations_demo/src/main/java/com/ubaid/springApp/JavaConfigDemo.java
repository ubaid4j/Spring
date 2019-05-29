package com.ubaid.springApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemo
{

	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context
			= new AnnotationConfigApplicationContext(ConfigClass.class);
		
		
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println(tennisCoach.getDailyWorkOut());
		System.out.println(tennisCoach.getDailyFortune());
		
		context.close();
	}

}
