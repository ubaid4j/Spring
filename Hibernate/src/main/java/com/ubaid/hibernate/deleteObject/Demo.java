package com.ubaid.hibernate.deleteObject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ubaid.hibernate.entity.Student;

/**
 * In this class, I will show you how to delete
 * object from the database
 * 
 * There are two options 
 * 1. getting persistent object from the session 
 * 	  and then put this object in session.delete method parameter
 * 2. create query in session and execute update
 * 
 * @author UbaidurRehman
 *
 */
public class Demo {

	public static void main(String[] args)
	{
		//create session factory
		SessionFactory factory = new Configuration()
									.addAnnotatedClass(Student.class)
									.configure("hibernate.cfg.xml")
									.buildSessionFactory();
		
		//session
		Session session = factory.getCurrentSession();
		
		//transaction
		Transaction transaction = session.beginTransaction();
		
		//retrieve object
		Student student = session.get(Student.class, 5);
		session.delete(student);
		
		int n = session.createQuery("delete from Student where id in (1, 2)").executeUpdate();
		
		System.out.println(n);
		
		transaction.commit();
		
	}

}
