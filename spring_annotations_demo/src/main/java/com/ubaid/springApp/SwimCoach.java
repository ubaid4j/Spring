package com.ubaid.springApp;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach
{
	private FortuneService fortuneService;
	
	@Value("${sc.name}")
	private String name;
	@Value("${sc.email}")
	private String email;
	
	
	public SwimCoach(FortuneService service)
	{
		this.fortuneService = service;
	}
	
	@Override
	public String getDailyWorkOut()
	{
		return "Swim 1000 meters as a warm up";
	}

	@Override
	public String getDailyFortune()
	{
		return fortuneService.getFortune();
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}	
}
