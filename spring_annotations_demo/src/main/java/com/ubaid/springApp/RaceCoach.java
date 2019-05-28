package com.ubaid.springApp;

import org.springframework.stereotype.Component;

@Component
public class RaceCoach implements Coach
{

	@Override
	public String getDailyWorkOut()
	{
		return "Garion ko sahi chamka kr rakho";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
