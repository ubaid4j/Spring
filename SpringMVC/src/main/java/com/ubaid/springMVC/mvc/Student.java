package com.ubaid.springMVC.mvc;

import java.util.HashMap;
import java.util.LinkedHashMap;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student
{
	private String firstName;
	private String lastName;
	private String country;
	private HashMap<String, String> countries;

	@Value("${i1.labels}")
	private String[] labels;
	@Value("${i1.countries}")
	private String[] coutrs;
	
	@PostConstruct
	public void init()
	{
		int size = labels.length;
		for(int i = 0; i < size; i++)
		{
			countries.put(labels[i], coutrs[i]);
		}
	}
	
	public Student()
	{
		countries = new LinkedHashMap<String, String>();
	}

	public String getFirstName() {
		return firstName;
	}

	@Value("${i1.firstName}")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Value("${i1.lastName}")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public HashMap<String, String> getCountries() {
		return countries;
	}
	
	
	
}
