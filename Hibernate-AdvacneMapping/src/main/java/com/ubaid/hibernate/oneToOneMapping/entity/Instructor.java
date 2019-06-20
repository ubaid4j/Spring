package com.ubaid.hibernate.oneToOneMapping.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * this class will map to Instructor table in the database
 * and it will one to one map with InstructorDetail class
 * 
 * for one to one mapping we will use
 * 1. @OneToOne(cascade=all)
 * 2. @JoinColumn(name="name")
 * @author UbaidurRehman
 *
 */
public class Instructor
{
	//fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@OneToOne(cascade=CascadeType.ALL)
	private InstructorDetail instructorDetail;
}
