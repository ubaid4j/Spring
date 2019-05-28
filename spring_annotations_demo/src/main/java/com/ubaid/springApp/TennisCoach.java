package com.ubaid.springApp;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach
{

	@Override
	public String getDailyWorkOut()
	{
		return "Practice your backhand volley";
	}

}
