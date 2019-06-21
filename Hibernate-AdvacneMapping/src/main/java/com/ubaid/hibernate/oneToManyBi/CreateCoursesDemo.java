package com.ubaid.hibernate.oneToManyBi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ubaid.hibernate.DisableLogs;
import com.ubaid.hibernate.oneToManyBi.entity.Course;
import com.ubaid.hibernate.oneToManyBi.entity.Instructor;
import com.ubaid.hibernate.oneToManyBi.entity.InstructorDetail;

public class CreateCoursesDemo
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
			
			//session
			session = factory.getCurrentSession();
			
			//transaction
			Transaction transaction = session.beginTransaction();
			
			//get Instructor
			Instructor instructor = session.get(Instructor.class, 1);
			
			//create courses
			Course course = new Course("C++");
			Course course2 = new Course("Java Script");
						
			instructor.addCourse(course);
			instructor.addCourse(course2);
			
			
			
			session.save(course);
			session.save(course2);
			
			System.out.println("Courses Added");
			transaction.commit();
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
