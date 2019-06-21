package com.ubaid.hibernate.oneToManyBi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ubaid.hibernate.DisableLogs;
import com.ubaid.hibernate.oneToManyBi.entity.Course;
import com.ubaid.hibernate.oneToManyBi.entity.Instructor;
import com.ubaid.hibernate.oneToManyBi.entity.InstructorDetail;

/**
 * In this class, I will create an instructor and add this instructor into the database
 * @author UbaidurRehman
 *
 */
public class CreateInstructorDemo
{
	public static void main(String [] args)
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
			
			Instructor instructor = new Instructor("Paracha", "Ubaid", "paracha.ubaid@seecs.edu.pk");
			InstructorDetail detail = new InstructorDetail("youtube/paracha", "movies");
			instructor.setInstructorDetail(detail);
			
			session.save(instructor);
			
			System.out.println(instructor + " added ");
			
			transaction.commit();
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
			factory.close();
		}
	}	
}
