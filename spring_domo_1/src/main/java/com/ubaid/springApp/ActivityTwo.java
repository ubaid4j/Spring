package com.ubaid.springApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ActivityTwo
{

	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context
			= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach coach = context.getBean("cricketCoach", CricketCoach.class);
		
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getDailyFortune());
		
		context.close();
	}

}
