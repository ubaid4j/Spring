package com.ubaid.hibernate.oneToManyUni.entity;

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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * this table has fk of instructor detail id
 * and it is one to one mapped with InstructorDetail Id
 * 
 * One Instructor has many courses so, we have put @OneToMany relationship and it is mapped to instructor 
 * in the Course
 * @author UbaidurRehman
 *
 */
@Entity
@Table(name="instructor")
public class Instructor
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="first_name")
	private String firstName;

	@Column(name="email")
	private String email;
	
	@JoinColumn(name = "instructor_detail_id")
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private InstructorDetail instructorDetail;
	
	@OneToMany(mappedBy="instructor", cascade= {
			CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH
	}, fetch=FetchType.LAZY)
	private List<Course> courses;
	
	public Instructor()
	{

	}

	public Instructor(String lastName, String firstName, String email)
	{
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public InstructorDetail getInstructorDetail() {
		return instructorDetail;
	}

	public void setInstructorDetail(InstructorDetail instructorDetail) {
		this.instructorDetail = instructorDetail;
	}

	
	
	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", email=" + email
				+ ", instructorDetail=" + instructorDetail + "]";
	}
	
	public void addCourse(Course course)
	{
		if(courses == null)
		{
			courses = new ArrayList<Course>();
		}
		
		course.setInstructor(this);
		courses.add(course);
	}
	
}
