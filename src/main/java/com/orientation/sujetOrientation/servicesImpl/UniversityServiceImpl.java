package com.orientation.sujetOrientation.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orientation.sujetOrientation.models.UniversityModel;
import com.orientation.sujetOrientation.repositories.UniversityRepository;
import com.orientation.sujetOrientation.services.UniversityService;

@Service
public class UniversityServiceImpl implements UniversityService{
	
	@Autowired
	private UniversityRepository universityRepository;

	public List<UniversityModel> getAllUniversities() {
		return this.universityRepository.findAll();
	}


	public UniversityModel getUniversityById(long id) {
		Optional<UniversityModel> university = universityRepository.findById(id);
		return university.isPresent() ? university.get() : null;
		}

	public UniversityModel updateUniversity(UniversityModel event) {
		return this.universityRepository.save(event);
	}

	public UniversityModel addUniversity(UniversityModel university) {
		return this.universityRepository.save(university);
	}

	public void deleteUniversity(long id) {
		this.universityRepository.deleteById(id);
		
	}


	



	
	
	
	
	
	

}
