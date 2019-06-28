package com.ubaid.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ubaid.app.aop.JavaConfig;
import com.ubaid.app.aop.dao.CustomerDAO;
import com.ubaid.app.aop.dao.MemberShipDAO;
import com.ubaid.app.aop.entity.Account;

public class App
{
	public static void main(String [] args)
	{
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
		CustomerDAO customerDAO = context.getBean("customerDAO", CustomerDAO.class);
		MemberShipDAO memberShipDAO = context.getBean("memberShipDAO", MemberShipDAO.class);
		
		customerDAO.addAccount(new Account(), true, 50000);

		memberShipDAO.addAccount();
		memberShipDAO.addMemberShip(5000d);
		
		
		context.close();
	}
	
	
}
