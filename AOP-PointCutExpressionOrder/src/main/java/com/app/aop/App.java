package com.app.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.aop.config.Config;
import com.app.aop.dao.AccountDAO;

public class App
{
	public static void main(String [] args)
	{
		AnnotationConfigApplicationContext context
			= new AnnotationConfigApplicationContext(Config.class);
		
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		accountDAO.setEnable(true);
		accountDAO.isEnable();
		accountDAO.addAccount();
		
		context.close();
	}
}
