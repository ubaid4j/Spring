package com.ubaid.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController
{
	@GetMapping("/")
	public String index()
	{
		return "home";
	}
	
	@GetMapping("/manager")
	public String manager()
	{
		return "manager";
	}
	
	@GetMapping("/admin")
	public String admin()
	{
		return "admin";
	}
}
