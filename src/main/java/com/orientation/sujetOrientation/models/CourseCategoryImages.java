package com.orientation.sujetOrientation.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="course_category_images")
public class CourseCategoryImages {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CourseImage_ID")
	private Long id;
	private String name;
	private String type;
	@Column(length=99999999)
	private byte[] picByte;
	public CourseCategoryImages() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CourseCategoryImages(String name, String type, byte[] picByte) {
		super();
		this.name = name;
		this.type = type;
		this.picByte = picByte;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public byte[] getPicByte() {
		return picByte;
	}
	public void setPicByte(byte[] picByte) {
		this.picByte = picByte;
	}
}
