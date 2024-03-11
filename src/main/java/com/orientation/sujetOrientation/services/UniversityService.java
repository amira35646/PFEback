package com.orientation.sujetOrientation.services;
import java.util.List;

import com.orientation.sujetOrientation.models.UniversityModel;
public interface UniversityService {
	
	
	public List<UniversityModel> getAllUniversities();
	public UniversityModel getUniversityById(long id);
	public UniversityModel updateUniversity(UniversityModel University);
	public UniversityModel addUniversity(UniversityModel University);
	public void deleteUniversity(long id);

}
