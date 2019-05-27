package com.ubaid.springApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ActivityThree
{

	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context
			= new ClassPathXmlApplicationContext("beanLifeCycleAppContext.xml");
		
		CricketCoach coach1 = context.getBean("cricketCoach", CricketCoach.class);
		CricketCoach coach2 = context.getBean("cricketCoach", CricketCoach.class);
		
		boolean result = (coach1 == coach2);
		
		System.out.println("\nCoach1 and Coach2 are pointing to same memory location? " + result);
		
		System.out.println("\nMemory location of Caoch1: " + coach1);
		System.out.println("\nMemory location of Coach2: " + coach2);
	}

}
