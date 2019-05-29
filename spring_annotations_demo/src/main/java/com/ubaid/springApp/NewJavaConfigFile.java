package com.ubaid.springApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class NewJavaConfigFile
{
	//IoC and DI
	
	@Bean
	public FortuneService getJungiFortuneService()
	{
		return new JangiFortuneService();
	}
	
	@Bean
	public Coach jangiCoach()
	{
		return new GunfireCoach(getJungiFortuneService());
	}
}
