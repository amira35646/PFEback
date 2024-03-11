package com.orientation.sujetOrientation.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orientation.sujetOrientation.models.EventModel;
import com.orientation.sujetOrientation.repositories.EventRepository;
import com.orientation.sujetOrientation.services.EventService;
@Service
public class EventServiceImpl implements EventService{
	@Autowired
	private EventRepository eventRepository;

	public List<EventModel> getAllEvents() {
		return this.eventRepository.findAll();
	}


	public EventModel getEventById(long id) {
		Optional<EventModel> event = eventRepository.findById(id);
		return event.isPresent() ? event.get() : null;
		}

	public EventModel updateEvent(EventModel event) {
		return this.eventRepository.save(event);
	}

	public EventModel addEvent(EventModel event) {
		return this.eventRepository.save(event);
	}

	public void deleteEvent(long id) {
		this.eventRepository.deleteById(id);
		
	}
}
