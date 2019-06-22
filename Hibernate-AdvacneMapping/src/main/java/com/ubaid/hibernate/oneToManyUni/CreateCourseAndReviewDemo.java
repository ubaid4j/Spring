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

public class CreateCourseAndReviewDemo
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
							.addAnnotatedClass(Review.class)
							.addAnnotatedClass(InstructorDetail.class)
							.addAnnotatedClass(Instructor.class)
							.addAnnotatedClass(Course.class)
							.buildSessionFactory();
			
			
			session = factory.getCurrentSession();
			
			Transaction transaction = session.beginTransaction();
		
			Instructor instructor = new Instructor("Rehman", "Ubaid", "urehman@gmail.com");
			InstructorDetail detail = new InstructorDetail("Playing Cricket", "youtube.com/pc");
			instructor.setInstructorDetail(detail);
			
			
			Course course = new Course("Java in Practice");

			instructor.addCourse(course);

			course.addReview(new Review("A good course"));
			course.addReview(new Review("good job, amazing"));
			
			session.save(instructor);
			session.save(course);
			
			
			
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
