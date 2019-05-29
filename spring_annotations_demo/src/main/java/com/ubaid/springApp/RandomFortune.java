package com.ubaid.springApp;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortune implements FortuneService
{
	@Value("${rf.a}")
	private String a;
	@Value("${rf.b}")
	private String b;
	@Value("${rf.c}")
	private String c;
	
	private String[] data = {a, b, c};
	
/*	
	private static String[] data = {
			"Work Work Work till you achieve success",
			"If your interal weather is cool, then every thing is cool",
			"How is this man, I worked very hard"
	};
*/
	
	public RandomFortune()
	{
		
		assert(data != null);
	}
	
	public void doPostConstruct()
	{
		data = new String[3];
		data[0] = a;
		data[1] = b;
		data[2] = c;
	}
	
	private static Random random = new Random();
	
	@Override
	public String getFortune()
	{
		return data[random.nextInt(data.length)];
	}

}
