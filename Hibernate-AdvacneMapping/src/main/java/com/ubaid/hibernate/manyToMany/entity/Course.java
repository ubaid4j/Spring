package com.ubaid.hibernate.manyToMany.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * This class has 1-n relationship with instructor [will do unidirectional]
 * and this entity has also m-n relationship with Student
 * 	
 * as we want unidirectional, so ignoring instructor_id 
 * we will mention instructor_Id in @JoinColumn annotation of Course Collection 
 * 
 * 
 * @author UbaidurRehman
 *
 */

@Entity
@Table(name="course")
public class Course
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	private String title;
	
	@JoinColumn(name="course_id")
	@OneToMany(cascade=CascadeType.ALL)
	private List<Review> reviews;
	
	
	@ManyToMany(cascade= {
			CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH
	}, fetch=FetchType.LAZY)
	@JoinTable(
			name="course_student",
			joinColumns=@JoinColumn(name="course_id"),
			inverseJoinColumns=@JoinColumn(name="student_id")
			)
	private List<Student> students;
	
	
	public Course()
	{

	}

	public Course(String title) {
		super();
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + "]";
	}
	
	public void addStudent(Student student)
	{
		if(students == null)
		{
			students = new ArrayList<Student>();
		}
		
		students.add(student);
	}
	
	public void addReview(Review review)
	{
		if(reviews == null)
		{
			reviews = new ArrayList<Review>();
		}
		
		reviews.add(review);
	}
}
