package com.ubaid.app.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class MemberShipDAO
{
	public void addAccount()
	{
		System.out.println(getClass() + ": Doing Stuff: Adding Membership account");
	}
	
	public void addMemberShip(Double d)
	{
		System.out.println("The fees of membership is about " + d);
	}
}
