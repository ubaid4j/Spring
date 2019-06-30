package com.ubaid.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ubaid.aop.config.JavaConfig;
import com.ubaid.aop.dao.AccountDAO;
import com.ubaid.aop.dao.MemberShipDAO;

public class App
{
	public static void main(String [] args)
	{
		AnnotationConfigApplicationContext context
			= new AnnotationConfigApplicationContext(JavaConfig.class);
		
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		MemberShipDAO memberShipDAO = context.getBean("memberShipDAO", MemberShipDAO.class);
		
		accountDAO.setId(23);
		accountDAO.setTitle("Ubaid ur Rehman");
		accountDAO.setType("Current");
		
		accountDAO.getId();
		accountDAO.getTitle();
		accountDAO.getType();
		
		memberShipDAO.getLevel();

		accountDAO.addAccount();
		memberShipDAO.addMembership();
		context.close();
	}
}
