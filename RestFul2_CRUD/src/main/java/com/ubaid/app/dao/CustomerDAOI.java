package com.ubaid.app.dao;

import java.util.List;

import com.ubaid.app.entity.Customer;

public interface CustomerDAOI
{
	public Customer getCustomer(int id);
	public List<Customer> getCustomers();
	public Customer saveCustomer(Customer customer);
	public void deleteCustomer(int id);
}
