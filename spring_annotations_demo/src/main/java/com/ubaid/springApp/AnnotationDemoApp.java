package com.ubaid.springApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp
{

	public static void main(String[] args)
	{
		// read spring CONFIG file
		ClassPathXmlApplicationContext context
			= new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from the spring container
		Coach coach = context.getBean("tennisCoach", Coach.class);
		
		//get the bean from the spring container
//		RaceCoach coach = context.getBean("raceCoach", RaceCoach.class);
		
		System.out.println(coach.getDailyWorkOut());
		
		System.out.println(coach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
