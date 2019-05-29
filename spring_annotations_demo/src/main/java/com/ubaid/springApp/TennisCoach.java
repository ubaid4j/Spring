package com.ubaid.springApp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach
{
	private FortuneService fortuneService;
	

	@PostConstruct
	public void init()
	{
		System.out.println("\nTennisCoach: inside init method");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("\nTennisCoach: inside destroy method");
	}
	
	@Autowired
	public TennisCoach(@Qualifier("randomFortune") FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}

	public TennisCoach()
	{
		System.out.println(">> TennisCoach: inside Constructor");
	}

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
