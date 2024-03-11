package com.orientation.sujetOrientation.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="courseBenefits")
public class CourseBenefitsModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CourseBenefits_ID")
	private long id;
	private String libelle;
	public CourseBenefitsModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CourseBenefitsModel(String libelle) {
		super();
		this.libelle = libelle;
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
	@Override
	public String toString() {
		return "CourseBenefitsModel [id=" + id + ", libelle=" + libelle + "]";
	}
	
}
