package com.ubaid.springHibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ubaid.springHibernate.entity.Customer;

/**
 * 
 * @Respository is the subclass of @Component, it tells spring container to scan this as DAO object 
 *              and it has different capabilities for JDBC exception managing
 *              
 * @Transactional automatically start and end the transaction 
 *                no need of session.beginTransaction and transaction.commit
 *                
 * @Autowired dependency injection
 *                
 * 
 * @author UbaidurRehman
 *
 */


@Repository
public class CustomerDAOImp implements CustomerDAO
{

	@Autowired
	SessionFactory sesssionFactory;
	
	
	@Override
	public List<Customer> getCustomers()
	{
		//get sessoin
		Session session = sesssionFactory.getCurrentSession();
		
		//create query
		Query<Customer> query = session.createQuery("from Customer", Customer.class);
		
		
		//get result list
		List<Customer> customers = query.getResultList();
		
		return customers;
	}

}
