package com.ubaid.hibernate.oneToOneMappingBi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ubaid.hibernate.oneToOneMappingBi.entity.Instructor;
import com.ubaid.hibernate.oneToOneMappingBi.entity.InstructorDetail;

/**
 * In this class, I will demonstrate how to delete only instructor detail and not another class which
 * reffered this:
 * 
 * Simply change the strategy of @OneToOne annotation in InstructorDetail
 * and remove remvoe strategy
 * @author UbaidurRehman
 *
 */
public class DeleteOnlyDetailInstructorDemo
{

	public static void main(String[] args)
	{
		SessionFactory factory = null;
		Session session = null;
		
		
		try
		{
			factory = new Configuration()
							.configure("hibernate.cfg.xml")
							.addAnnotatedClass(InstructorDetail.class)
							.addAnnotatedClass(Instructor.class)
							.buildSessionFactory();
			
			//session
			session = factory.getCurrentSession();
			
			//transaction
			Transaction transaction = session.beginTransaction();
			
			//get object [instructor detail, now when we delete this object, then hibernate delete 
			//only this object not Instructor as the cascade type is changed now
			
			InstructorDetail detail = session.get(InstructorDetail.class, 6);
			System.out.println("Found Instructo Detail: " + detail);
			
			//remove the reference of deleted object [InstructorDetail] in the instructor
			detail.getInstructor().setInstructor_detail(null);
			
			session.delete(detail);
			
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
