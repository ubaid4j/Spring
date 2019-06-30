package com.ubaid.aop.dao;

import org.springframework.stereotype.Repository;

import com.ubaid.aop.entity.Account;

@Repository
public class AccountDAO
{
	private int id;
	private String title;
	private String type;
	
	
	public void addAccount()
	{
		System.out.println(getClass() + " : Adding Account---------------------");
	}
	
	public AccountDAO()
	{

	}
	
	public AccountDAO(Account account)
	{
		System.out.println(getClass() + " : In AccountDAO constructor");
	}
	
	public AccountDAO(String title, String type) {
		super();
		this.title = title;
		this.type = type;
	}
	public int getId() {
		System.out.println(getClass() + " : getId");
		return id;
	}
	public void setId(int id) {
		System.out.println(getClass() + " : setId");
		this.id = id;
	}
	public String getTitle() {
		System.out.println(getClass() + " : getTitle");
		return title;
	}
	public void setTitle(String title) {
		System.out.println(getClass() + " : setTitle");
		this.title = title;
	}
	public String getType() {
		System.out.println(getClass() + " : getType");
		return type;
	}
	public void setType(String type) {
		System.out.println(getClass() + " : setType");
		this.type = type;
	}	
}
