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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * This class has foreign key which is mapped to Instructor
 * One Instructor has many courses
 * If a course(s) is deleted then it will not effect on Instructor
 * Instructor and Course has one to many bidirectional relationship
 * @author UbaidurRehman
 *
 */

@Entity
@Table(name="course")
public class Course
{
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="title")
	private String title;
	
	@JoinColumn(name="instructor_id")
	@ManyToOne(cascade= {
			CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST
			,CascadeType.REFRESH
	}, fetch = FetchType.LAZY)
	private Instructor instructor;
	
	
	/**
	 * As this is UniDirectional mapping, so, we add @JoinColumn and named it the actual name of 
	 * foreign key column of review 
	 */
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="course_id")
	private List<Review> reviews;
	
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

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	
	
	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", instructor=" + instructor.getId() + "]";
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
