package com.orientation.sujetOrientation.controllers;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.orientation.sujetOrientation.models.EventImages;
import com.orientation.sujetOrientation.models.EventModel;
import com.orientation.sujetOrientation.services.EventService;

@RestController
@RequestMapping("api/events")
@CrossOrigin("*")
public class EventController {
	@Autowired
	private EventService eventService;
	@GetMapping
	public List<EventModel> getAllEvents() {
		return this.eventService.getAllEvents();
	}
	@PutMapping("/update")
	public EventModel updateEvent( @RequestBody EventModel event) {
		return this.eventService.updateEvent(event);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteEvent(@PathVariable long id) {
		eventService.deleteEvent(id);
	}
	@PostMapping(value={"/create"},consumes= {MediaType.MULTIPART_FORM_DATA_VALUE})
	public EventModel addEvent(@RequestPart("event") EventModel event,
			@RequestPart("imageFile")MultipartFile [] file) {
			try {
			Set<EventImages> images =uploadImage(file);
			event.setEventImages(images);
			return this.eventService.addEvent(event);
		} catch(Exception e ) {
			return null;
		}
	}
	public Set<EventImages> uploadImage(MultipartFile[] multipartFiles) throws IOException {
		  Set<EventImages> imageModels = new HashSet<>();
		  for (MultipartFile file : multipartFiles) {
			  EventImages imageModel = new EventImages(
		      file.getOriginalFilename(),
		      file.getContentType(),
		      file.getBytes()
		    );
		    imageModels.add(imageModel);
		  }
		  return imageModels;
		}
	@GetMapping("/{id}")
	public EventModel getEventById(@PathVariable long id) {
		return this.eventService.getEventById(id);
	}
}
