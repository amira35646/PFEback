package com.orientation.sujetOrientation.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orientation.sujetOrientation.models.UniversityModel;
import com.orientation.sujetOrientation.services.UniversityService;

@CrossOrigin("*")
@RestController
@RequestMapping("api/universities")

public class UniversityController {
	
	@Autowired
	private UniversityService universityService;
	@GetMapping
	public List<UniversityModel> getAllEvents() {
		return this.universityService.getAllUniversities();
	}
	@PutMapping("/update")
	public UniversityModel updateUniversity(UniversityModel university) {
		return this.universityService.updateUniversity(university);
	}
	@DeleteMapping("delete/{id}")
	public void deleteUniversity(@PathVariable int id) {
		universityService.deleteUniversity(id);
	}
	@PostMapping("/create")
	public UniversityModel addMatch(@RequestBody UniversityModel university) {
		return this.universityService.addUniversity(university);
	}
	@GetMapping("/{id}")
	public UniversityModel getUniversityById(@PathVariable int id) {
		return this.universityService.getUniversityById(id);
	}

}


