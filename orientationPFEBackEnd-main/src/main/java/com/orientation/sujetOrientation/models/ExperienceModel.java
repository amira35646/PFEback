package com.orientation.sujetOrientation.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="experience")
public class ExperienceModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Experience_ID")
	private long id;
	private String name;
	private String poste;
	private String section;
	private String location;
	private String nbExperience;
	private String level;
	private String description;



}
