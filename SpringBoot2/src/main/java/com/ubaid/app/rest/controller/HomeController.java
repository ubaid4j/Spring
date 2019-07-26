package com.ubaid.app.rest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController
{

	@Value("${dev.name}")
	private String info;
	
	@GetMapping("/")
	public String info()
	{
		return info;
	}
}
