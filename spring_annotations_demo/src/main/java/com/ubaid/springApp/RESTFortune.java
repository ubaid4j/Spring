package com.ubaid.springApp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RESTFortune implements FortuneService
{
//	@Value("${rf.name}")
	private String name;
	
//	@Value("${rf.email}")
	private String email;
	
	public RESTFortune()
	{
		System.out.println("RESTFortune: inside constructor");
	}
	
	@Value("${rf.name}")	
	public void setName(String name) {
		System.out.println("RESTFortune: inside setter method setName");
		this.name = name;
	}

	@Value("${rf.email}")
	public void setEmail(String email) {
		System.out.println("RESTFortune: inside setter method setEmail");
		this.email = email;
	}


	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String getFortune()
	{
		return String.format("Good Luck %s\t%s\n", getName(), getEmail());
	}

}
