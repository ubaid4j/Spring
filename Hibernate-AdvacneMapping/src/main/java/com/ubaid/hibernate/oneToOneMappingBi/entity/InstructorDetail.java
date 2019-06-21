package com.ubaid.hibernate.oneToOneMappingBi.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * As we want to maintain Bidirection so, we will store instance of Instructor
 * and we will add mappedBy feature, here mappedBy refer to the field of this instance
 * which is annotated by @JoinColumn 
 * 
 * Note: We didn't mention the names in the annotations.
 * The name of fields will be treated as their default name
 * @author UbaidurRehman
 *
 */
@Entity
@Table(name="instructor_detail")
public class InstructorDetail
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int id;

	@Column
	private String youtube_channel;
	
	@Column
	private String hobby;
	
	//remove CascadeType.REMOVE when you want to delete only InstructorDetail
	
	@OneToOne(mappedBy="instructor_detail", cascade= {
			CascadeType.DETACH, CascadeType.MERGE,
			CascadeType.PERSIST, CascadeType.REFRESH,
	})
	private Instructor instructor;
	
	public InstructorDetail()
	{
		
	}

	public InstructorDetail(String youtube_channel, String hobby)
	{
		super();
		this.youtube_channel = youtube_channel;
		this.hobby = hobby;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getYoutube_channel() {
		return youtube_channel;
	}

	public void setYoutube_channel(String youtube_channel) {
		this.youtube_channel = youtube_channel;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	@Override
	public String toString() {
		return "InstructorDetail [id=" + id + ", youtube_channel=" + youtube_channel + ", hobby=" + hobby + "]";
	}
	
	
	
	
}
