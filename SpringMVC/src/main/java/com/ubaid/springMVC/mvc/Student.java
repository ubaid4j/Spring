package com.ubaid.springMVC.mvc;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student
{
	private String firstName;
	private String lastName;
	private String country;
	private HashMap<String, String> countries;
	
	public Student()
	{
		countries = new LinkedHashMap<String, String>();
		countries.put("PK", "Pakistan");
		countries.put("SRA", "Saudia Arabia");
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
