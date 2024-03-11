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
@Table(name="university")
public class UniversityModel {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="University_ID")
    private int id;
    private String name;
    private String description;
    private String location;
    private String tel;
    private String type ;
    private String campus;
    
    
    @ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
    @JoinTable(
    	    name = "images",
    	    joinColumns = @JoinColumn(name = "University_ID"),
    	    inverseJoinColumns = @JoinColumn(name = "IMAGE_ID")
    	)
    private Set<UniversityImages> universityImages;
    public UniversityModel() {}   
	public UniversityModel(String name, String description, String location, String tel, String type,
			String campus , Set<UniversityImages> universityImages) {
		super();
		this.name = name;
		this.description = description;
		this.location = location;
		this.tel = tel;
		this.type = type;
		this.campus = campus;
		this.universityImages=universityImages ; 
	}

	
	public Set<UniversityImages> getUniversityImages() {
		return universityImages;
	}
	public void setUniversityImages(Set<UniversityImages> universityImages) {
		this.universityImages = universityImages;
	}
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getCampus() {
		return campus;
	}


	public void setCampus(String campus) {
		this.campus = campus;
	}


	@Override
	public String toString() {
		return "UniverityModel [id=" + id + ", name=" + name + ", description=" + description + ",type="+type +  ",location=" + location +", campus="+ campus + ", tel=" + tel  +"]";
	}

    
}