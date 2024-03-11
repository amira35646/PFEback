package com.orientation.sujetOrientation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orientation.sujetOrientation.models.AboutModel;
import com.orientation.sujetOrientation.services.AboutService;

@RestController
@RequestMapping("api/about")
@CrossOrigin("*")
public class AboutController {
	@Autowired
	private AboutService aboutService;
	@GetMapping("/{id}")
	public AboutModel getAboutById(@PathVariable long id){
		return this.aboutService.getAbout(id);
	}
	@PostMapping("/create")
	public AboutModel addAboutContent(AboutModel about) {
		return this.aboutService.addAbout(about);
	}
	@PutMapping("/update")
	public AboutModel UpdateAboutContent(@RequestBody AboutModel about) {
		return this.aboutService.updateAbout(about);
	}
}
