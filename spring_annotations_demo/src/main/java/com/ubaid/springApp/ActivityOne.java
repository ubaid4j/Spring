package com.ubaid.springApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ActivityOne
{
	public static void main(String [] args)
	{
		//application context
		ClassPathXmlApplicationContext context
			= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//getting bean
		Coach coach = context.getBean("raceCoach", Coach.class);
		
		//printing
		System.out.println(coach.getDailyWorkOut());
		
		//closing context
		context.close();
	}
}
