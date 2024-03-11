package com.orientation.sujetOrientation.models;

import java.util.Set;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="event")
public class EventModel {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="Event_ID")
private long id;
private String title;
private String description;
private String location;
private String date;
private int startTime; 
private int endTime;
private String eventURL;
@ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
@JoinTable(
	    name = "images",
	    joinColumns = @JoinColumn(name = "Event_ID"),
	    inverseJoinColumns = @JoinColumn(name = "IMAGE_ID")
	)
private Set<EventImages> eventImages;
public EventModel() {}
public EventModel(String title, String description, String location, String date, int startTime, int endTime,
		String eventURL, Set<EventImages> eventImages) {
	this.title = title;
	this.description = description;
	this.location = location;
	this.date = date;
	this.startTime = startTime;
	this.endTime = endTime;
	this.eventURL = eventURL;
	this.eventImages = eventImages;
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
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public int getStartTime() {
	return startTime;
}
public void setStartTime(int startTime) {
	this.startTime = startTime;
}
public int getEndTime() {
	return endTime;
}
public void setEndTime(int endTime) {
	this.endTime = endTime;
}
public String getEventURL() {
	return eventURL;
}
public void setEventURL(String eventURL) {
	this.eventURL = eventURL;
}
public Set<EventImages> getEventImages() {
	return eventImages;
}
public void setEventImages(Set<EventImages> eventImages) {
	this.eventImages = eventImages;
}


}
