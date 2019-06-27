package com.ubaid.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ubaid.app.aop.JavaConfig;
import com.ubaid.app.aop.dao.CustomerDAO;

public class App
{
	public static void main(String [] args)
	{
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
		CustomerDAO customerDAO = context.getBean("customerDAO", CustomerDAO.class);
		
		customerDAO.addAccount();

		System.out.println("\n\nAgain---------------\n\n");
		
		customerDAO.addAccount();
		
		context.close();
	}
	
	
}
