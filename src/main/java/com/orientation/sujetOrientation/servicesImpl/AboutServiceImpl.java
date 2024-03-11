package com.orientation.sujetOrientation.servicesImpl;

import java.util.Optional;

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

	@Override
	public AboutModel getAbout(long id) {
		// TODO Auto-generated method stub
		Optional<AboutModel> about = aboutRepository.findById(id);
		return about.isPresent() ? about.get() : null;
	}

}
