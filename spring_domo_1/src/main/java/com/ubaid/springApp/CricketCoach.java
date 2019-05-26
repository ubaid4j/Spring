package com.ubaid.springApp;

public class CricketCoach implements Coach {

	@Override
	public String getDailyWorkOut()
	{
		return "Practice on Bowling and Fielding";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
