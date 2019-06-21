package com.ubaid.hibernate.oneToManyBi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ubaid.hibernate.DisableLogs;
import com.ubaid.hibernate.oneToManyBi.entity.Course;
import com.ubaid.hibernate.oneToManyBi.entity.Instructor;
import com.ubaid.hibernate.oneToManyBi.entity.InstructorDetail;

public class GetCoursesDemo
{

	public static void main(String[] args)
	{
		DisableLogs.disableLogging();
		
		SessionFactory factory = null;
		Session session = null;
		
		try
		{
			//session factory
			factory = new Configuration()
							.configure("hibernate.cfg.xml")
							.addAnnotatedClass(InstructorDetail.class)
							.addAnnotatedClass(Instructor.class)
							.addAnnotatedClass(Course.class)
							.buildSessionFactory();
			
			//session
			session = factory.getCurrentSession();
			
			//transaction
			Transaction transaction = session.beginTransaction();
			
			Instructor instructor = session.get(Instructor.class, 1);
			System.out.println(instructor.getCourses());
			transaction.commit();
	
		}
		catch(Exception exp)
		{
			
		}
		finally
		{
			
		}
	}

}
