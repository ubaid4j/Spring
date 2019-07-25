package com.ubaid.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ubaid.app.dao.CustomerDAOImp;
import com.ubaid.app.entity.Customer;

@Service
public class CustomerServiceImp implements CustomerServiceI {

	@Autowired
	CustomerDAOImp dao;
	
	@Override
	@Transactional
	public Customer getCustomer(int id)
	{
		return dao.getCustomer(id);
	}

	@Override
	@Transactional
	public List<Customer> getCustomers()
	{
		return dao.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer customer)
	{
		dao.saveCustomer(customer);
	}

	@Override
	@Transactional
	public void deleteCustomer(int id)
	{
		dao.deleteCustomer(id);
	}

}
