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

public class CreateEntitiesDemeo
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
							.addAnnotatedClass(Course.class)
							.addAnnotatedClass(Instructor.class)
							.addAnnotatedClass(InstructorDetail.class)
							.addAnnotatedClass(Review.class)
							.addAnnotatedClass(Student.class)
							.buildSessionFactory();
			
			session = factory.getCurrentSession();
			
			
			Transaction transaction = session.beginTransaction();
			
			//create instructor
			Instructor instructor = new Instructor("Muhammad Ali", "Tahir", "mTahir@seecs.edu.pk");
			
			//create instructor detail
			InstructorDetail instructorDetail = new InstructorDetail("youtube/ML", "ML");
			
			instructor.setInstructorDetail(instructorDetail);
			
			session.save(instructor);
			
			//as instructor detail is bidirectional
			session.save(instructorDetail);
			
			//create course
			Course course = new Course("Machine Learning");
			
			//create review
			Review review = new Review("Fucking good one");
			Review review2 = new Review("Amazing");
			course.addReview(review);
			course.addReview(review2);
			
			//create student
			Student student = new Student("Ubaid ur ", "Rehman", "urehman.bese16seecs@seecs.edu.pk");
			course.addStudent(student);
			
			session.save(student);
			session.save(course);
			
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
