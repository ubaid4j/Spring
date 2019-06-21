package com.ubaid.hibernate.oneToOneMappingBi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ubaid.hibernate.oneToOneMappingBi.entity.Instructor;
import com.ubaid.hibernate.oneToOneMappingBi.entity.InstructorDetail;

/**
 * here I will demonstrate, deletion of Instructor detail, 
 * and when we delete instructor detail, the instructor will automatically deleted 
 * as the cascade strategy is All. 
 * @author UbaidurRehman
 *
 */
public class DeleteDetailInstructorDemo
{

	public static void main(String[] args)
	{
		SessionFactory factory = null;
		Session session = null;
		
		try
		{
			//factory
			factory = new Configuration()
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(InstructorDetail.class)
						.addAnnotatedClass(Instructor.class)
						.buildSessionFactory();
			
			//session
			session = factory.getCurrentSession();
			
			
			//transaction
			Transaction transaction = session.beginTransaction();
			
			//getting persistent object
			InstructorDetail instructorDetail = session.get(InstructorDetail.class, 3);
			
			System.out.println("Found Object: " + instructorDetail);
			
			session.delete(instructorDetail);
			
			transaction.commit();
			
		}
		catch (Exception e)
		{
			
		}
		finally
		{
			
		}
	}

}
