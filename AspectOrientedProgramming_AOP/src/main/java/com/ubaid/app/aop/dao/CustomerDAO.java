package com.ubaid.app.aop.dao;

import org.springframework.stereotype.Component;

import com.ubaid.app.aop.entity.Account;

@Component
public class CustomerDAO
{
	public boolean addAccount(Account account, boolean level, Integer in)
	{
		System.out.println(getClass() + " working to db work to add account and vlaue --> " + in);
		return level;
	}
}
