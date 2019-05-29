package com.ubaid.springApp;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune()
	{
		return "Today is sad day";
	}

}
