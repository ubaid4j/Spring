package com.ubaid.hibernate.oneToManyBi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="instructor_detail")
public class InstructorDetail
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="youtube_channel")
	private String youttubeChannel;
	
	@Column(name="hobby")
	private String hobby;
	
	public InstructorDetail()
	{

	}

	public InstructorDetail(String youttubeChannel, String hobby) {
		super();
		this.youttubeChannel = youttubeChannel;
		this.hobby = hobby;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getYouttubeChannel() {
		return youttubeChannel;
	}

	public void setYouttubeChannel(String youttubeChannel) {
		this.youttubeChannel = youttubeChannel;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "InstructorDetail [id=" + id + ", youttubeChannel=" + youttubeChannel + ", hobby=" + hobby + "]";
	}
	
	
	
}
