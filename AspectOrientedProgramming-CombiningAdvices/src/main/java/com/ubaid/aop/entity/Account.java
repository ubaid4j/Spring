package com.ubaid.aop.entity;

import org.springframework.stereotype.Component;

@Component
public class Account
{
	private int id;
	private String title;
	
	public Account()
	{

	}
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", title=" + title + "]";
	}
	public Account(String title) {
		super();
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
