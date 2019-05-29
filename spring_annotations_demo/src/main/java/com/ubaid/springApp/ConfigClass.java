package com.ubaid.springApp;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.ubaid.springApp")
@PropertySource("classpath:sport.properties")
public class ConfigClass
{
	@Bean
	public FortuneService getFortuneService()
	{
		return new SadFortuneService();
	}
	
	@Bean
	public Coach swimCoach()
	{
		return new SwimCoach(getFortuneService());
	}
}
