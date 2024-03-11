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
@Table(name="course_category")
public class CourseCategoryModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CourseCategory_ID")
	private long id;
	private String libelle;
	private int nbCourses;
	@ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinTable(
		    name = "Categoryimages",
		    joinColumns = @JoinColumn(name = "CourseCategory_ID"),
		    inverseJoinColumns = @JoinColumn(name = "CourseImage_ID")
		)
	private Set<CourseCategoryImages> courseCategoryImages;
	public CourseCategoryModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CourseCategoryModel(String libelle, int nbCourses, Set<CourseCategoryImages> courseCategoryImages) {
		super();
		this.libelle = libelle;
		this.nbCourses = nbCourses;
		this.courseCategoryImages = courseCategoryImages;
	}
	public long getId() {
		return id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public int getNbCourses() {
		return nbCourses;
	}
	public void setNbCourses(int nbCourses) {
		this.nbCourses = nbCourses;
	}
	public Set<CourseCategoryImages> getCourseCategoryImages() {
		return courseCategoryImages;
	}
	public void setCourseCategoryImages(Set<CourseCategoryImages> courseCategoryImages) {
		this.courseCategoryImages = courseCategoryImages;
	}
	@Override
	public String toString() {
		return "CourseCategoryModel [id=" + id + ", libelle=" + libelle + ", nbCourses=" + nbCourses
				+ ", courseCategoryImages=" + courseCategoryImages + "]";
	}
	
	
}
