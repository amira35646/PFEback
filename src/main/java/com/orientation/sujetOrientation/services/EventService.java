package com.orientation.sujetOrientation.services;

import java.util.List;


import com.orientation.sujetOrientation.models.EventModel;


public interface EventService {
	public List<EventModel> getAllEvents();
	public EventModel getEventById(long id);
	public EventModel updateEvent(EventModel event);
	public EventModel addEvent(EventModel event);
	public void deleteEvent(long id);
}
