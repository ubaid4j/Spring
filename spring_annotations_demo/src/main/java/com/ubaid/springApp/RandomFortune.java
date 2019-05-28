package com.ubaid.springApp;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortune implements FortuneService
{
	private static String[] data = {
			"Work Work Work till you achieve success",
			"If your interal weather is cool, then every thing is cool",
			"How is this man, I worked very hard"
	};
	
	private static Random random = new Random();
	
	@Override
	public String getFortune()
	{
		return data[random.nextInt(data.length)];
	}

}
