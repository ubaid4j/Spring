package com.ubaid.hibernate.readingDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ubaid.hibernate.entity.Student;

/**
 * we can get an Object using session.get(T, id) 
 * @author UbaidurRehman
 *
 */
public class ReadingDemo
{
	public static void main(String [] args)
	{
		//getting sessionFactory
		SessionFactory factory = new Configuration()
									 .addAnnotatedClass(Student.class)
									 .configure("hibernate.cfg.xml")
									.buildSessionFactory();
		
		//getting Session
		Session session = factory.getCurrentSession();
		
		//start transaction
		Transaction transaction = session.beginTransaction();
		
		//create object
		Student student = new Student("Hina", "Rubani", "hinaRubani@khar.com");
		System.out.println("Student: " + student);
		
		session.save(student);
		
		System.out.println("Student-> Generated ID " + student);
		
		
		transaction.commit();
		session.close();
		
		
		//--------------------------------Reading objects-----------------------------------------------//
		session = factory.getCurrentSession();
		transaction = session.beginTransaction();
		
		Student myStudent = session.get(Student.class, student.getId());
		
		System.out.println("Retrieved Student: " + myStudent);
		
		transaction.commit();
		session.close();
	}
}
