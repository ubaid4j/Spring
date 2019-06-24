package com.ubaid.springHibernate.dao;

import java.util.List;

import com.ubaid.springHibernate.entity.Customer;

public interface CustomerDAO
{
	public List<Customer> getCustomers();
}
