package com.orientation.sujetOrientation.models;

import java.util.Set;

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
import javax.persistence.Table;

@Entity
@Table(name="courseInstructor")
public class CourseInstructor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Instructor_ID")
	private long id;
	private String name;
	private String nameURL;
	@ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinTable(
		    name = "CourseInstructors",
		    joinColumns = @JoinColumn(name = "Instructor_ID"),
		    inverseJoinColumns = @JoinColumn(name = "InstructorImage_ID")
		)
	private Set<CourseInstructorImages> courseInstructorImages;
	public CourseInstructor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CourseInstructor(String name, String nameURL, Set<CourseInstructorImages> courseInstructorImages) {
		super();
		this.name = name;
		this.nameURL = nameURL;
		this.courseInstructorImages = courseInstructorImages;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNameURL() {
		return nameURL;
	}
	public void setNameURL(String nameURL) {
		this.nameURL = nameURL;
	}
	public Set<CourseInstructorImages> getCourseInstructorImages() {
		return courseInstructorImages;
	}
	public void setCourseInstructorImages(Set<CourseInstructorImages> courseInstructorImages) {
		this.courseInstructorImages = courseInstructorImages;
	}
	@Override
	public String toString() {
		return "CourseInstructor [id=" + id + ", name=" + name + ", nameURL=" + nameURL + ", courseInstructorImages="
				+ courseInstructorImages + "]";
	}
	
	
}
