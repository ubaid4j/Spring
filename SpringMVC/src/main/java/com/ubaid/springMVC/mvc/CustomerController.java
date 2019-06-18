package com.ubaid.springMVC.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController
{
	
	@InitBinder
	public void binder(WebDataBinder dataBinder)
	{
		
		
		//editor which trim the string
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		
		//registering the editor with data binder
		dataBinder.registerCustomEditor(String.class, editor);
		

	}
	
	
	@RequestMapping("/showForm")
	public String showForm(Model model)
	{
		AnnotationConfigApplicationContext context
			= new AnnotationConfigApplicationContext(Config.class);

		Customer customer = context.getBean("customer", Customer.class);
		
		context.close();
		
		model.addAttribute("customer", customer);
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult result)
	{
		
		System.out.println("Binding Result: " + result);
		
		/**
		 * if rules are violated then if will return customer-form 
		 * along with error message
		 */
		if(result.hasErrors())
		{
			return "customer-form";
		}
		else
		{
			return "customer-confirmation";			
		}
	}
}
