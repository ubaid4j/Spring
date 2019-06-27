package com.ubaid.springHibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ubaid.springHibernate.dao.CustomerDAO;
import com.ubaid.springHibernate.entity.Customer;

/**
 * This is service layer which act as FACADE design
 * 
 * We use here:
 * 		1. @Service which tells Spring to scan this class as service
 * 		2. @Transactional moved from DAO to service [is used to automatically begin and end transaction]
 * 
 * @author UbaidurRehman
 *
 */
@Service
public class CustomerServiceImp implements CustomerService
{

	@Autowired
	CustomerDAO customerDAO;
	
	
	@Override
	@Transactional
	public List<Customer> getCustomers()
	{
		return customerDAO.getCustomers();
	}


	@Override
	@Transactional
	public void saveCustomer(Customer customer)
	{
		customerDAO.saveCustomer(customer);
	}


	@Override
	@Transactional
	public Customer getCustomer(int id)
	{
		return customerDAO.getCustomer(id);
	}


	@Override
	@Transactional
	public void deleteCustomer(int customerId)
	{
		customerDAO.deleteCustomer(customerId);
	}

}
