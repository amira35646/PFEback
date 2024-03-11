package com.orientation.sujetOrientation.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="coursePorgram")
public class CourseProgramModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CourseProgram_ID")
	private long id;
	private String title;
	private String Description;
	public CourseProgramModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CourseProgramModel(String title, String description) {
		super();
		this.title = title;
		Description = description;
	}
	public long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	@Override
	public String toString() {
		return "CourseProgramModel [id=" + id + ", title=" + title + ", Description=" + Description + "]";
	}
	
	
}
