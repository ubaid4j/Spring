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
		
		//call methods on bean (daily work out)
		System.out.println(coach.getDailyWorkOut());
		
		//get fortune service
		System.out.println(coach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
