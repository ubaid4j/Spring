package com.ubaid.springApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context
			= new ClassPathXmlApplicationContext("beanLifeCycleAppContext.xml");
		
		Coach coach = context.getBean("myCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkOut());
		
		context.close();
	}

}
