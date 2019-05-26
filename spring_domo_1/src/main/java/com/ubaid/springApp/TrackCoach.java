package com.ubaid.springApp;

public class TrackCoach implements Coach
{
	//fortune service field
	private FortuneService fortuneService;
	
	public TrackCoach()
	{
		
	}
	
	public TrackCoach(FortuneService fortuneService)
	{
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut()
	{
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it " + fortuneService.getFortune();
	}

}
