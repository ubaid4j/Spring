package com.ubaid.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/")
public class HomeController
{
	@GetMapping("/")
	public String getHomePage()
	{
		return "home";
	}
	
	@GetMapping("/manager")
	public String getManagerPage()
	{
		return "manager";
	}
	
	@GetMapping("/admin")
	public String getAdminPage()
	{
		return "admin";
	}
}
