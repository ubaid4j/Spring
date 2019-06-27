package com.ubaid.app.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class CustomerDAO
{
	public void addAccount()
	{
		System.out.println(getClass() + " working to db work to add account");
	}
}
