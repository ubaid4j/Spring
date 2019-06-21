package com.ubaid.hibernate.oneToOneMappingUni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ubaid.hibernate.oneToOneMappingUni.entity.Instructor;
import com.ubaid.hibernate.oneToOneMappingUni.entity.InstructorDetail;

public class OneToOneDemoUni {

	public static void main(String[] args)
	{
		//session factory
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(InstructorDetail.class)
									.addAnnotatedClass(Instructor.class)
									.buildSessionFactory();
		
		//session
		Session session = factory.getCurrentSession();
		
		//begin transaction
		Transaction transaction = session.beginTransaction();
		
		InstructorDetail instructorDetail = new 
				InstructorDetail("https://www.youtube.com/itsUbaid", "Java Developer");

		Instructor instructor = new
				Instructor("Nawab Zada", "Rehman", "urehman.bese16seecs@seecs.edu.pk");
		
		instructor.setInstructorDetail(instructorDetail);
		
		session.save(instructor);
		
		transaction.commit();
				
	}

}
