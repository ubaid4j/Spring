package com.ubaid.springApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationScopeDemo
{
	public static void main(String [] args)
	{
		//ClassPathXML
		ClassPathXmlApplicationContext context
			= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach tennisCoach_1 = context.getBean("tennisCoach", Coach.class);
		Coach tennisCoach_2 = context.getBean("tennisCoach", Coach.class);
		
		boolean result = tennisCoach_1 == tennisCoach_2;
		
		System.out.println("\nIs tennisCoach_1 and tennisCoach_2 are same: " + result);
		System.out.println("\nMemory location for tennisCoach_1: " + tennisCoach_1);
		System.out.println("\nMemory location for tennisCoach_2: " + tennisCoach_2);
		
		context.close();
		
	}
}
