package com.ubaid.hibernate.manyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ubaid.hibernate.DisableLogs;
import com.ubaid.hibernate.manyToMany.entity.Course;
import com.ubaid.hibernate.manyToMany.entity.Instructor;
import com.ubaid.hibernate.manyToMany.entity.InstructorDetail;
import com.ubaid.hibernate.manyToMany.entity.Review;
import com.ubaid.hibernate.manyToMany.entity.Student;

public class GetCoursesForAStudentDemo {

	public static void main(String[] args)
	{
		DisableLogs.disableLogging();
		
		SessionFactory factory = null;
		Session session = null;
		
		try
		{
			factory = new Configuration()
							.configure("hibernate.cfg.xml")
							.addAnnotatedClass(Course.class)
							.addAnnotatedClass(Instructor.class)
							.addAnnotatedClass(InstructorDetail.class)
							.addAnnotatedClass(Review.class)
							.addAnnotatedClass(Student.class)
							.buildSessionFactory();
			
			session = factory.getCurrentSession();
			
			
			Transaction transaction = session.beginTransaction();
			
			//get a student
			Student student = session.get(Student.class, 1);
			
			System.out.println("Student Found: " + student);
			
			System.out.println(student.getCourses());
			
			
			
			transaction.commit();
		}
		catch(Exception exp)
		{
			exp.printStackTrace();
		}
		finally
		{
			factory.close();
			session.close();
		}

	}

}
