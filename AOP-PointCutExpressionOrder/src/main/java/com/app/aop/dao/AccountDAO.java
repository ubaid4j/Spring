package com.app.aop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDAO
{
	private boolean isEnable;
	
	
	public void addAccount()
	{
		System.out.println(getClass() + " in addAccount()");
	}


	public boolean isEnable()
	{
		System.out.println(getClass() + " in isEnable()");
		return isEnable;
	}


	public void setEnable(boolean isEnable) {
		System.out.println(getClass() + " in setEnable()");
		this.isEnable = isEnable;
	}
}
