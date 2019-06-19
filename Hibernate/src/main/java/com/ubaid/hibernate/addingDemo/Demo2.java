package com.ubaid.hibernate.addingDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ubaid.hibernate.entity.Student;

public class Demo2
{

	public static void main(String[] args)
	{
		//first creating SessionFactory
		//adding annotated class
		//adding the configuration file
		SessionFactory sessionFactory = new Configuration()
											.addAnnotatedClass(Student.class)
											.configure("hibernate.cfg.xml")
											.buildSessionFactory();
		
		//creating session
		Session session = sessionFactory.getCurrentSession();
		
		System.out.println("Starting Transaction");
		
		//creating Transaction
		Transaction transaction = session.beginTransaction();
		
		//creating object
		Student student1 = new Student("Ubaid", "UR Rehman", "ubaidshan007@gmail.com");
		Student student2 = new Student("Attiq", "UR Rehman", "attiqurrehman@gmail.com");
		Student student3 = new Student("Saqib", "UR Rehman", "saqibrehman@gmail.com");
		
		//saving objects in the session
		session.save(student1);
		session.save(student2);
		session.save(student3);
		
		//Committing transaction
		transaction.commit();
		
		System.out.println("Done!--");
		
		

	}

}
