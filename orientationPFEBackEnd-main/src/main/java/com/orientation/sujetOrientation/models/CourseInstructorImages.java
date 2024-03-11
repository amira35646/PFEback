package com.orientation.sujetOrientation.models;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="InstructorImages")
public class CourseInstructorImages {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="InstructorImage_ID")
	private Long id;
	private String name;
	private String type;
	@Column(length=99999999)
	private byte[] picByte;
	public CourseInstructorImages() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CourseInstructorImages(String name, String type, byte[] picByte) {
		super();
		this.name = name;
		this.type = type;
		this.picByte = picByte;
	}
	public Long getId() {
		return id;
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
	@Override
	public String toString() {
		return "CourseInstructorImages [id=" + id + ", name=" + name + ", type=" + type + ", picByte="
				+ Arrays.toString(picByte) + "]";
	}
	
}
