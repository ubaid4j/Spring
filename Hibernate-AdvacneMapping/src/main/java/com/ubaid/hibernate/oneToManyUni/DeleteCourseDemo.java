package com.ubaid.hibernate.oneToManyUni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ubaid.hibernate.DisableLogs;
import com.ubaid.hibernate.oneToManyUni.entity.Course;
import com.ubaid.hibernate.oneToManyUni.entity.Instructor;
import com.ubaid.hibernate.oneToManyUni.entity.InstructorDetail;
import com.ubaid.hibernate.oneToManyUni.entity.Review;

public class DeleteCourseDemo {

	public static void main(String[] args)
	{
		DisableLogs.disableLogging();
		
		SessionFactory factory = null;
		Session session = null;
		
		try
		{
			factory = new Configuration()
							.configure("hibernate.cfg.xml")
							.addAnnotatedClass(Review.class)
							.addAnnotatedClass(InstructorDetail.class)
							.addAnnotatedClass(Instructor.class)
							.addAnnotatedClass(Course.class)
							.buildSessionFactory();
			
			
			session = factory.getCurrentSession();
			
			Transaction transaction = session.beginTransaction();
		
			//let first get review and delete it and check what happens to course
//			Review review = session.get(Review.class, 1);
//			session.delete(review);
			
			//let delete course and check what happens to reviews 
			Course course = session.get(Course.class, 10);
			session.delete(course);
			
			
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
