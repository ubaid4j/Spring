package com.ubaid.springHibernate.controller;

import java.util.List;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ubaid.springHibernate.entity.Customer;
import com.ubaid.springHibernate.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController
{

	@Autowired
	CustomerService customerService;
	
	@GetMapping("/list")
	public String showList(Model model)
	{
		List<Customer> customers = customerService.getCustomers();
		model.addAttribute("customers", customers);
		return "customer-list";
	}
	
	/**
	 * this method will render the page insert customer attribute model
	 * @param model
	 * @return
	 */
	
	@GetMapping("/addNewCustomer")
	public String showAddCustomer(Model model)
	{
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "add_customer";
	}
	
	
	/**
	 * this method actually save the customer and redirect page to customer/list
	 * @param customer
	 * @return
	 */
	@PostMapping("/addNewCustomer")
	public String addCustomer(@ModelAttribute Customer customer)
	{
		customerService.saveCustomer(customer);
		return "redirect:/customer/list";
	}
	
	@GetMapping("/updateCustomer")
	public String updateCustomer(@RequestParam("customerId") int id, Model model)
	{
		Customer customer = customerService.getCustomer(id);
		model.addAttribute("customer", customer);
		return "add_customer";
	}
		
}
