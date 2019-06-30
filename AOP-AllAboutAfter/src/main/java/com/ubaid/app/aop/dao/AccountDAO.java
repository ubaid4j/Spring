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
	
	public void addAccount(Account account)
	{
		accounts.add(account);
	}
	
	public List<Account> findAccounts()
	{
		System.out.println("Finding Account");
		return accounts;
	}
	
	public AccountDAO(String url) {
		super();
		this.url = url;
	}
	public AccountDAO() {
		super();
		accounts = new ArrayList<Account>();
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
