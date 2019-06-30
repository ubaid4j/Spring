package com.ubaid.app.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ubaid.app.aop.config.Config;
import com.ubaid.app.aop.dao.AccountDAO;
import com.ubaid.app.aop.entity.Account;

public class App
{
	public static void main(String [] args)
	{
		AnnotationConfigApplicationContext context
			= new AnnotationConfigApplicationContext(Config.class);
		
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		Account account = new Account("Ubaid ur Rehman", "Silver");
		Account account2 = new Account("Attiq ur Rehman", "Gold");
		Account account3 = new Account("Attif Ayub", "Platinum");
				
		accountDAO.addAccount(account);
		accountDAO.addAccount(account2);
		accountDAO.addAccount(account3);
		
		context.close();
	}
}
