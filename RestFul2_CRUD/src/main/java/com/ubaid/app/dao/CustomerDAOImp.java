package com.ubaid.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ubaid.app.entity.Customer;

@Repository
public class CustomerDAOImp implements CustomerDAOI
{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Customer getCustomer(int id)
	{
		
		Session session = sessionFactory.getCurrentSession();
		
		return session.get(Customer.class, id);
	}

	@Override
	public List<Customer> getCustomers()
	{
		Session session = sessionFactory.getCurrentSession();
		
		Query<Customer> query = session.createQuery("from Customer order by lastName", Customer.class);
	
		return query.getResultList();
	}

	@Override
	public void saveCustomer(Customer customer)
	{
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(customer);
	}

	@Override
	public void deleteCustomer(int id)
	{
		Session session = sessionFactory.getCurrentSession();
		Customer customer = session.get(Customer.class, id);
		session.delete(customer);
	}

}
