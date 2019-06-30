package com.ubaid.app.aop;

import java.util.List;

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
		
		accountDAO.addAccount(new Account("Ubaid ur Rehman", "Platinum"));
		accountDAO.addAccount(new Account("Attiq ur Rehman", "Golg"));
		accountDAO.addAccount(new Account("Atif Ayub", "Silver"));
		
		
		List<Account> accounts = accountDAO.findAccounts();
		
		System.out.println("App: " + accounts);
		
		context.close();
	}
}
