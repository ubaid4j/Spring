package com.ubaid.springMVC.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@RequestMapping("confirmationVersionTwo")
	public String capatilizeTheMessage(HttpServletRequest req, Model model)
	{
		//getting parameter
		String name = req.getParameter("studentN");
		
		//capitalize 
		name = "Hello G! " + name.toUpperCase();
		
		//adding in model
		model.addAttribute("message", name);
		
		return "confirmation";
	}
}
