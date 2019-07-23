package com.ubaid.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SecController
{
	@GetMapping("/login")
	public String getLoginPage()
	{
		return "login";
	}
	
	@GetMapping("/accessDenied")
	public String getExceptionPage()
	{
		return "accessDeniedPage";
	}
}
