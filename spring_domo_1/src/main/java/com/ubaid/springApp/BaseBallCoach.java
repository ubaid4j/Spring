package com.ubaid.springApp;

public class BaseBallCoach implements Coach
{
	@Override
	public String getDailyWorkOut()
	{
		return "Spend 30 minutes on batting practice";
	}
}
