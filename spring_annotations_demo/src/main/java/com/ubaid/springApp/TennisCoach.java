package com.ubaid.springApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach
{
	private FortuneService fortuneService;
	

	@Autowired
	public TennisCoach(@Qualifier("randomFortune") FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}

	public TennisCoach()
	{
		System.out.println(">> TennisCoach: inside Constructor");
	}

/*
	@Autowired
	public void doSomeCrazyThing(FortuneService fortuneService)
	{
		System.out.println(">> TennisCoach: inside doSomeCrazyThing Method ");
		this.fortuneService = fortuneService;
	}
*/	
	@Override
	public String getDailyWorkOut()
	{
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune()
	{
		return fortuneService.getFortune();
	}

}
