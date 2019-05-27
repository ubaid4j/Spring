package com.ubaid.springApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp
{

	public static void main(String[] args)
	{
		//load the spring configuration file
		ClassPathXmlApplicationContext context
			= new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
		
		Coach coach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);

		
		// check if they are same bena
		boolean result = (coach == alphaCoach);
		
		System.out.println("\nPointing the same object: " + result);
		System.out.println("\nMemory location for Coach: " + coach);
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");
		
		//close the context
		context.close();
	}

}
