package com.ubaid.springApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp
{

	public static void main(String[] args)
	{
		//load a spring configuration file
		ClassPathXmlApplicationContext context
			= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve spring bean from container 
		Coach coach = context.getBean("myCoach", Coach.class);
		
		//call methods on bean
		System.out.println(coach.getDailyWorkOut());
		
		//close the context
		context.close();
	}

}
