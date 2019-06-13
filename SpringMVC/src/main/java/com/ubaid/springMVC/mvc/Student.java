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
	private String favoriteLanguage;
	private String gender;
	private String rating;
	
	private HashMap<String, String> countries;
	private HashMap<Integer, String> ratings;
	
	/**
	 * getting values from the property files
	 */
	@Value("${i1.labels}")
	private String[] labels;
	@Value("${i1.countries}")
	private String[] coutrs;
	@Value("${i1.ratingKeys}")
	private int[] ratingKey;
	@Value("${i1.ratings}")
	private String[] ratingsValue;
	private String[] oses;
	private String[] companies;
	private String[] companiesName;
	
	
	/**
	 * constructing countries mapping after construction of all fields
	 */
	@PostConstruct
	public void init()
	{
		int size = labels.length;
		for(int i = 0; i < size; i++)
		{
			countries.put(labels[i], coutrs[i]);
		}
	
		size = ratingKey.length;
		for(int i = 0; i < size; i++)
		{
			ratings.put(ratingKey[i], ratingsValue[i]);
		}
		
	}
	
	public Student()
	{
		countries = new LinkedHashMap<String, String>();

		ratings = new LinkedHashMap<Integer, String>();

		
	}

	public String getFirstName() {
		return firstName;
	}

	@Value("${def.firstName}")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Value("${def.lastName}")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	@Value("${def.country}")
	public void setCountry(String country) {
		this.country = country;
	}

	public HashMap<String, String> getCountries() {
		return countries;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	@Value("${def.language}")
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String getGender() {
		return gender;
	}

	@Value("${def.gender}")
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRating() {
		return rating;
	}

	@Value("${def.rating}")
	public void setRating(String rating) {
		this.rating = rating;
	}

	public HashMap<Integer, String> getRatings() {
		return ratings;
	}

	public String[] getOses() {
		return oses;
	}

	public void setOses(String[] oses) {
		this.oses = oses;
	}

	public String[] getCompanies() {
		return companies;
	}
	
	@Value("${def.companyName}")
	public void setCompanies(String[] companies) {
		this.companies = companies;
	}

	public String[] getCompaniesName() {
		return companiesName;
	}

	@Value("${companies.name}")
	public void setCompaniesName(String[] companiesName) {
		this.companiesName = companiesName;
	}

	
	
	
}
