package com.orientation.sujetOrientation.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orientation.sujetOrientation.models.AboutModel;
import com.orientation.sujetOrientation.repositories.AboutRepository;
import com.orientation.sujetOrientation.services.AboutService;
@Service
public class AboutServiceImpl implements AboutService{
@Autowired
private AboutRepository aboutRepository;
	public AboutModel updateAbout(AboutModel about) {
	 return this.aboutRepository.save(about);
	}

	public AboutModel addAbout(AboutModel about) {
		 return this.aboutRepository.save(about);
	}

}
