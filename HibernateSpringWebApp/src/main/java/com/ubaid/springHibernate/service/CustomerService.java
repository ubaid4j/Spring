package com.ubaid.springHibernate.service;

import java.util.List;

import com.ubaid.springHibernate.entity.Customer;

public interface CustomerService
{
	public List<Customer> getCustomers();
	public void saveCustomer(Customer customer);
}