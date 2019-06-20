package com.ubaid.hibernate.queryObject;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ubaid.hibernate.entity.Student;

/**
 * 
 * Here, we are querying objects 
 * simple create query and getResultList
 * 
 * @author UbaidurRehman
 *
 */
public class QueryObjectDemo
{
	public static void main(String[] args)
	{
		//create session factory
		SessionFactory factory = new Configuration()
									.addAnnotatedClass(Student.class)
									.configure("hibernate.cfg.xml")
									.buildSessionFactory();
		
		//create session
		Session session = factory.getCurrentSession();
		
		//create transaction
		Transaction transaction = session.beginTransaction();
		
		//create query select * from Student
		List<Student> students = session.createQuery("from Student", Student.class).getResultList();
		
		displayStudent(students);
		
		//Query
		students = session.createQuery("from Student where lastName = 'Rubani'", Student.class).getResultList();
		System.out.println("\n\n");
		displayStudent(students);
		
		//query
		students = session.createQuery("from Student where email like '%gmail.com'", Student.class).getResultList();
		System.out.println("\n\n");
		displayStudent(students);
		
		
		transaction.commit();
	}

	private static void displayStudent(List<Student> students) {
		for(Student student : students)
		{
			System.out.println(student);
		}
	}
}
