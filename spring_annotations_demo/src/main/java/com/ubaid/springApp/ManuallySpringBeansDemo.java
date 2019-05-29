package com.ubaid.springApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ManuallySpringBeansDemo
{

	public static void main(String[] args)
	{
		//context
		AnnotationConfigApplicationContext context
			= new AnnotationConfigApplicationContext(ConfigClass.class);
		
		//get bean
		SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);
		
		
		//print
		System.out.println(coach.getDailyWorkOut());
		System.out.println(coach.getDailyFortune());
		System.out.println("Name: " + coach.getName());
		System.out.println("Email: " +  coach.getEmail());
		
		//close context
		context.close();
	}

}
