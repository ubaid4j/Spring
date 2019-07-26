package com.ubaid.app.rest.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController
{
	@GetMapping("/")
	public String index()
	{
		return "The Current time on server is " + LocalDateTime.now();
	}
	
	@GetMapping("/workout")
	public String workOut()
	{
		return "Get daily workout at the rate of 100 push ups";
	}
}
