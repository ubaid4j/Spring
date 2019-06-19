package com.ubaid.hibernate.addingDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ubaid.hibernate.entity.Student;

public class Demo
{

	public static void main(String[] args)
	{
		//create session factory
		SessionFactory sessionFactory = new Configuration()
											.addAnnotatedClass(Student.class)
											.configure("hibernate.cfg.xml")
											.buildSessionFactory();
		
		//create session
		Session session = sessionFactory.getCurrentSession();
		
		System.out.println("Transaction Started");
		
		//create transaction
		Transaction transaction = session.beginTransaction();
		
		//create object
		Student student = new Student("hum", "sub", "hamsub007@gmail.com");
		Student student1 = new Student("hum", "sub", "hamsub007@gmail.com");
		
		//saving object in the session
		session.save(student);
		session.save(student1);
		
		//committing the session
		transaction.commit();
		System.out.println("Done!--------");
		
		//closing session
		session.close();
	}

}
