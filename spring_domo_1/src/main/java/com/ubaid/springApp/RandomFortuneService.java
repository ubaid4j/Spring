package com.ubaid.springApp;

import java.util.Random;

public class RandomFortuneService implements FortuneService
{
	private static String[] fortuneArray = {"random fortune1", "random fortune2", "randome fortune3"};
	private static Random random = new Random();
	
	
	public static void setFortuneArray(String[] fortuneArray) {
		RandomFortuneService.fortuneArray = fortuneArray;
	}


	@Override
	public String getFortune()
	{
		return fortuneArray[random.nextInt(3)];
	}

}
