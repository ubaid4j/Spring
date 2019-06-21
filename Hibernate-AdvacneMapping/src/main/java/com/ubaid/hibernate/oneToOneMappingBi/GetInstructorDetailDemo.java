package com.ubaid.hibernate.oneToOneMappingBi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ubaid.hibernate.oneToOneMappingBi.entity.Instructor;
import com.ubaid.hibernate.oneToOneMappingBi.entity.InstructorDetail;

/**
 * Now our entities are bidirectional, 
 * we will retrieve InstructorDetail and we can get its respective Instructor
 * @author UbaidurRehman
 *
 */
public class GetInstructorDetailDemo
{

	public static void main(String[] args)
	{
		SessionFactory factory = null;
		Session session = null;
		
		
		try
		{
			//session factory
			factory = new Configuration()
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(InstructorDetail.class)
						.addAnnotatedClass(Instructor.class)
						.buildSessionFactory();
			
			//session
			session = factory.getCurrentSession();
			
			//begin transaction
			Transaction transaction = session.beginTransaction();
			
			//getting Instructor Detail
			InstructorDetail detail = session.get(InstructorDetail.class, 3);
			
			System.out.println("Instructor detail: " + detail);
			System.out.println("Instructor: " + detail.getInstructor());
			
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
