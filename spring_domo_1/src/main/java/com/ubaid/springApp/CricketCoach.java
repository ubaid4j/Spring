package com.ubaid.springApp;

public class CricketCoach implements Coach
{

	private FortuneService fortuneService;
	
	//add new fields for email address and team
	private String emailAddress;
	private String team;
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress)
	{
		System.out.println("CricketCoach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team)
	{
		System.out.println("CricketCoach: inside setter method - setTeamMethod");
		this.team = team;
	}

	public CricketCoach()
	{
		System.out.println("CricketCoach: inside no-arg Constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService)
	{
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkOut()
	{
		return "Practice on Bowling and Fielding";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
