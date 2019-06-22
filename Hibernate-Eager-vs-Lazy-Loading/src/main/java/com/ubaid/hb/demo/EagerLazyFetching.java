package com.ubaid.hb.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ubaid.hb.DisableLogs;
import com.ubaid.hb.entity.Course;
import com.ubaid.hb.entity.Instructor;
import com.ubaid.hb.entity.InstructorDetail;

public class EagerLazyFetching
{

	public static void main(String[] args)
	{
		
		DisableLogs.disableLogging();
		
		SessionFactory factory = null;
		Session session = null;
		
		try
		{
			factory = new Configuration()
							.configure("hibernate.cfg.xml")
							.addAnnotatedClass(InstructorDetail.class)
							.addAnnotatedClass(Instructor.class)
							.addAnnotatedClass(Course.class)
							.buildSessionFactory();
			
			session = factory.getCurrentSession();
			
			Transaction transaction = session.beginTransaction();
			
			Instructor instructor = session.get(Instructor.class, 1);
			
			
			System.out.println(instructor);

			System.out.println(instructor.getCourses());

			transaction.commit();

			session.close();
			
			System.out.println("Session is closed");
			System.out.println(instructor.getCourses());
			
		}
		catch(Exception exp)
		{
			exp.printStackTrace();
		}
		finally
		{
			session.close();
			factory.close();
		}
	}

}
