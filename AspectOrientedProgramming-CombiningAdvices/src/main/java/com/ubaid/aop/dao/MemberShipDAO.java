package com.ubaid.aop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MemberShipDAO
{
	private String level;

	public MemberShipDAO()
	{
		System.out.println(getClass() + " : MemberShipDAO()");
	}
	
	public String getLevel() {
		System.out.println(getClass() + " : geLevel");
		return level;
	}

	public void setLevel(String level) {
		System.out.println(getClass() + " : setLevel");
		this.level = level;
	}
	
	public void addMembership()
	{
		System.out.println("Adding Membership of someone -------------------------------");
	}
}
