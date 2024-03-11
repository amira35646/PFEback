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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class CourseModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Course_ID")
	private long id;
	private String title;
	private String description;
	private String subCategory;
	private String duration;
	private String location;
	private String training_center;
	private String situation;
	private int price;
	private String courseURL;
	@ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinTable(
		    name = "CourseCategories",
		    joinColumns = @JoinColumn(name = "Course_ID"),
		    inverseJoinColumns = @JoinColumn(name = "CourseCategory_ID")
		)
	private Set<CourseCategoryModel> courseCategory;
	@ManyToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinTable(
		    name = "CourseInstructors",
		    joinColumns = @JoinColumn(name = "Course_ID"),
		    inverseJoinColumns = @JoinColumn(name = "Instructor_ID")
		)
	private CourseInstructor courseInstructor;
	@ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinTable(
		    name = "CourseProgramTable",
		    joinColumns = @JoinColumn(name = "Course_ID"),
		    inverseJoinColumns = @JoinColumn(name = "CourseProgram_ID")
		)
	private Set<CourseProgramModel> CourseProgram;

	@ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinTable(
		    name = "CourseBenefitsTable",
		    joinColumns = @JoinColumn(name = "Course_ID"),
		    inverseJoinColumns = @JoinColumn(name = "CourseBenefits_ID")
		)
	private Set<CourseBenefitsModel> courseBenefits;
	public CourseModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CourseModel(String title, String description, String subCategory, String duration, String location,
			String training_center, String situation, int price, String courseURL,
			Set<CourseCategoryModel> courseCategory, CourseInstructor courseInstructor,
			Set<CourseProgramModel> courseProgram, Set<CourseBenefitsModel> courseBenefits) {
		super();
		this.title = title;
		this.description = description;
		this.subCategory = subCategory;
		this.duration = duration;
		this.location = location;
		this.training_center = training_center;
		this.situation = situation;
		this.price = price;
		this.courseURL = courseURL;
		this.courseCategory = courseCategory;
		this.courseInstructor = courseInstructor;
		CourseProgram = courseProgram;
		this.courseBenefits = courseBenefits;
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
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTraining_center() {
		return training_center;
	}
	public void setTraining_center(String training_center) {
		this.training_center = training_center;
	}
	public String getSituation() {
		return situation;
	}
	public void setSituation(String situation) {
		this.situation = situation;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCourseURL() {
		return courseURL;
	}
	public void setCourseURL(String courseURL) {
		this.courseURL = courseURL;
	}
	public Set<CourseCategoryModel> getCourseCategory() {
		return courseCategory;
	}
	public void setCourseCategory(Set<CourseCategoryModel> courseCategory) {
		this.courseCategory = courseCategory;
	}
	public CourseInstructor getCourseInstructor() {
		return courseInstructor;
	}
	public void setCourseInstructor(CourseInstructor courseInstructor) {
		this.courseInstructor = courseInstructor;
	}
	public Set<CourseProgramModel> getCourseProgram() {
		return CourseProgram;
	}
	public void setCourseProgram(Set<CourseProgramModel> courseProgram) {
		CourseProgram = courseProgram;
	}
	public Set<CourseBenefitsModel> getCourseBenefits() {
		return courseBenefits;
	}
	public void setCourseBenefits(Set<CourseBenefitsModel> courseBenefits) {
		this.courseBenefits = courseBenefits;
	}
	@Override
	public String toString() {
		return "CourseModel [id=" + id + ", title=" + title + ", description=" + description + ", subCategory="
				+ subCategory + ", duration=" + duration + ", location=" + location + ", training_center="
				+ training_center + ", situation=" + situation + ", price=" + price + ", courseURL=" + courseURL
				+ ", courseCategory=" + courseCategory + ", courseInstructor=" + courseInstructor + ", CourseProgram="
				+ CourseProgram + ", courseBenefits=" + courseBenefits + "]";
	}
	

}
