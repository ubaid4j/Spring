package com.ubaid.springMVC.mvc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController
{

	
	@RequestMapping("/showForm")
	public String showForm(Model model)
	{
		AnnotationConfigApplicationContext context
		= new AnnotationConfigApplicationContext(Config.class);

		Student student = context.getBean("student", Student.class);
		context.close();
		model.addAttribute("student", student);
		return "student-form";
	}
	
	@RequestMapping("/confirm")
	public String confirm(@ModelAttribute("student") Student student)
	{	
		return "studentConfirmation";
	}
}
