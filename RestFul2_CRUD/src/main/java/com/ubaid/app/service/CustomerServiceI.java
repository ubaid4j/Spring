package com.ubaid.app.service;

import java.util.List;

import com.ubaid.app.entity.Customer;

public interface CustomerServiceI
{
	public Customer getCustomer(int id);
	public List<Customer> getCustomers();
	public void saveCustomer(Customer customer);
	public void deleteCustomer(int id);

}
