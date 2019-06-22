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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * This entity has one to one relationship with instructor detail
 * @author UbaidurRehman
 *
 */

@Entity
@Table(name="instructor")
public class Instructor
{
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@JoinColumn(name="instructor_detail_id")
	@OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private InstructorDetail instructorDetail;
	
	/**
	 * So, we have a list of courses
	 * and we relate them as one to many unidirectional
	 * so, here we need @OneToMany() and @JoinColumn() 
	 * @JoinColumn() will tell HIBERNATE how to join course table and Instructor
	 * name parameter in @JoinColumn will represent the foreign key column in the course table
	 */
	
	@OneToMany(cascade= {
			CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH
	}, fetch=FetchType.LAZY)
	@JoinColumn(name="instructor_id")
	private List<Course> courses;
	
	public Instructor()
	{

	}

	public Instructor(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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
		return "Instructor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", instructorDetail=" + instructorDetail + "]";
	}
	
	public void addCourses(Course course)
	{
		if(courses == null)
		{
			courses = new ArrayList<Course>();
		}
		
		courses.add(course);
	}
	
}
