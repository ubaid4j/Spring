package com.ubaid.springMVC.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController
{
	@RequestMapping("showForm")
	public String showForm()
	{
		return "helloWorldForm";
	}
	
	@RequestMapping("confirmation")
	public String showConfirmation()
	{
		return "confirmation";
	}
}
