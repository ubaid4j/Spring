package com.ubaid.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HomeController
{
	@GetMapping("/home")
	public String helloWorld()
	{
		return "Hello World";
	}
}
