package com.ubaid.hb.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.ubaid.hb.DisableLogs;
import com.ubaid.hb.entity.Course;
import com.ubaid.hb.entity.Instructor;
import com.ubaid.hb.entity.InstructorDetail;

public class HQLJoinFetch {

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
			
			//hql query
			//to get Instructor and with Instructor its all courses
			String q = "SELECT i FROM Instructor i "
					+ "JOIN FETCH i.courses c "
					+ "WHERE i.id = :id";
			
			//creating query
			Query<Instructor> query = session.createQuery(q, Instructor.class);

			
			//setting parameter
//			query.setParameter(1, 1);
			query.setParameter("id", 1);
			
			//getting single result
			Instructor instructor = query.getSingleResult();
			
		
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
