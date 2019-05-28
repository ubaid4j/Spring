package com.ubaid.springApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RaceCoach implements Coach
{

	private FortuneService service;
	
	@Autowired
	public RaceCoach(@Qualifier("RESTFortune") FortuneService service)
	{
		System.out.println("RaceCaoch: inside constructor");
		this.service = service;
	}
	
	
	@Override
	public String getDailyWorkOut()
	{
		return "Garion ko sahi chamka kr rakho";
	}

	@Override
	public String getDailyFortune() {
		return service.getFortune();
	}

}
