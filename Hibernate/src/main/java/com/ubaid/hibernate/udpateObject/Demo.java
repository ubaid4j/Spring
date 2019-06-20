package com.ubaid.hibernate.udpateObject;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ubaid.hibernate.entity.Student;

/**
 * 
 * There are two methods :
 * 1. simply retrieve an persistent object from session using session.get(T, id)
 * 	  and then set value of this object and then commit
 * 
 * 2. create query using session and execute update
 * 
 * @author UbaidurRehman
 *
 */
public class Demo
{

	public static void main(String[] args)
	{
		//create Session Factory
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		
		//create session
		Session session = factory.getCurrentSession();
		
		//transaction begin
		Transaction transaction = session.beginTransaction();
		
		//get persistent object using id = 4
		Student student = session.get(Student.class, 4);

		student.setLastName("Ubaid");
		
		//using execute update
		session.createQuery("update Student set email = 'hinaUbaid@gmail.com' where id = 4").executeUpdate();
		
		
		transaction.commit();
		
		
		
		
	}

}
