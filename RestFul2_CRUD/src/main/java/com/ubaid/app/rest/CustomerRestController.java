package com.ubaid.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ubaid.app.entity.Customer;
import com.ubaid.app.rest.exception.CustomerNotFoundException;
import com.ubaid.app.service.CustomerServiceI;

@RestController
@RequestMapping("/api")
public class CustomerRestController
{
	@Autowired
	@Qualifier("customerServiceImp")
	CustomerServiceI custSer;
	
	/**
	 * this method returns all customers
	 * @return all customers
	 */
	@GetMapping("/customers")
	public List<Customer> getCustomers()
	{
		return custSer.getCustomers();
	}
	
	
	/**
	 * this method return a customer
	 * @param customerId
	 * @return a customer
	 */
	@GetMapping("/customers/{customerId}")
	public Customer getCustomer(@PathVariable int customerId)
	{
		Customer customer = custSer.getCustomer(customerId);
		if(customer == null)
			throw new CustomerNotFoundException("The customer of id " + customerId + " is not found");
		return custSer.getCustomer(customerId);
	}
	
	/**
	 * this method add a customer
	 * @param customer
	 * @return 
	 */
	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer customer)
	{
		customer.setId(0);
		return custSer.saveCustomer(customer);
	}
	
	/**
	 * this method update a customer
	 * @param customer
	 * @return
	 */
	@PutMapping("/customers")
	public Customer updateCustomer(@RequestBody Customer customer)
	{
		return custSer.saveCustomer(customer);
	}
	
	
	/**
	 * this method delete a customer
	 * @param id
	 * @return
	 */
	@DeleteMapping("/customers/{id}")
	public String deleteCustomer(@PathVariable int id)
	{
		Customer customer = custSer.getCustomer(id);
		if(customer == null) 
			throw new CustomerNotFoundException("The customer of id [ " + id + " ] is not found");
		custSer.deleteCustomer(id);
		return "Customer deleted ~ id [ " + id + " ]";
	}
}
