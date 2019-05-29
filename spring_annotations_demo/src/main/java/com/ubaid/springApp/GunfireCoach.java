package com.ubaid.springApp;

public class GunfireCoach implements Coach
{
	private FortuneService fortuneService;
	
	public GunfireCoach(FortuneService service)
	{
		this.fortuneService = service;
	}

	@Override
	public String getDailyWorkOut()
	{
		return "Work on your nishana";
	}

	@Override
	public String getDailyFortune() 
	{
		return fortuneService.getFortune();
	}

}
