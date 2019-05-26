package com.ubaid.springApp;

public class BaseBallCoach implements Coach
{
	//defining private field for the dependency injection
	private FortuneService fortuneService;
	
	//constructor for dependency injection
	public BaseBallCoach(FortuneService fortuneService)
	{
		this.fortuneService = fortuneService;
	}
	
	
	@Override
	public String getDailyWorkOut()
	{
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		//use my fortune service to get fortune service
		return fortuneService.getFortune();
	}
}
