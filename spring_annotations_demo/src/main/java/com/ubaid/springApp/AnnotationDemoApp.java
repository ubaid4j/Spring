package com.ubaid.springApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args)
	{
		// read spring CONFIG file
		ClassPathXmlApplicationContext context
			= new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from the spring container
		Coach coach = context.getBean("tennisCoach", Coach.class);
		
		
		// call a method on the bean
		System.out.println(coach.getDailyWorkOut());
		
		//call method get daily fortune
		System.out.println(coach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
