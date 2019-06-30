package com.ubaid.app.aop.entity;

import org.springframework.stereotype.Component;

@Component
public class Account
{
	private int id;
	private String name;
	private String level;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", level=" + level + "]";
	}
	public Account(String name, String level) {
		super();
		this.name = name;
		this.level = level;
	}
	public Account() {
		super();
	}
	
	
}
