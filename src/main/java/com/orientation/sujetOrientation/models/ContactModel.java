package com.orientation.sujetOrientation.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contact")
public class ContactModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Contact_ID")
	private long id;
	private String FullName;
	private String email;
	private String phone;
	private String topic;
	private String message;
	public ContactModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContactModel(String fullName, String email, String phone, String topic, String message) {
		super();
		FullName = fullName;
		this.email = email;
		this.phone = phone;
		this.topic = topic;
		this.message = message;
	}
	public long getId() {
		return id;
	}

	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ContactModel [id=" + id + ", FullName=" + FullName + ", email=" + email + ", phone=" + phone
				+ ", topic=" + topic + ", message=" + message + "]";
	}

}
