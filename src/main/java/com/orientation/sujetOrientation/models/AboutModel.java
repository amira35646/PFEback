package com.orientation.sujetOrientation.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="about")
public class AboutModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="About_ID")
	private long id;
	private String footerContent;
	private String homeContent;
	public AboutModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AboutModel(String footerContent, String homeContent) {
		super();
		this.footerContent = footerContent;
		this.homeContent = homeContent;
	}
	public long getId() {
		return id;
	}
	public String getFooterContent() {
		return footerContent;
	}
	public void setFooterContent(String footerContent) {
		this.footerContent = footerContent;
	}
	public String getHomeContent() {
		return homeContent;
	}
	public void setHomeContent(String homeContent) {
		this.homeContent = homeContent;
	}

}
