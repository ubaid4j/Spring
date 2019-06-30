package com.ubaid.app.aop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ubaid.app.aop.entity.Account;

@Repository
public class AccountDAO
{
	private String url;
	private List<Account> accounts;
	
	public AccountDAO()
	{
		accounts = new ArrayList<Account>();
	}
	
	
	public void addAccount(Account account)
	{
		accounts.add(account);
		System.out.println(getClass() + " : addAccount()");
	}

	public String getUrl()
	{
		System.out.println(getClass() + " : getURL");
		return url;
	}

	public void setUrl(String url)
	{
		System.out.println(getClass() + " : setURL");
		this.url = url;
	}
}
