package com.ubaid.springApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);
		
		System.out.println(cricketCoach.getDailyWorkOut());
		System.out.println(cricketCoach.getDailyFortune());
		System.out.println(cricketCoach.getEmailAddress());
		System.out.println(cricketCoach.getTeam());
		
		context.close();
	}

}
