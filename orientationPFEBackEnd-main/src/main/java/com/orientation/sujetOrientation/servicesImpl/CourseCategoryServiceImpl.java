package com.orientation.sujetOrientation.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orientation.sujetOrientation.models.CourseCategoryModel;
import com.orientation.sujetOrientation.repositories.CourseCategoryRepository;
import com.orientation.sujetOrientation.services.CourseCategoryService;
@Service
public class CourseCategoryServiceImpl implements CourseCategoryService{
@Autowired
private CourseCategoryRepository courseCategoryRepository;
	public List<CourseCategoryModel> getAllCourseCategories() {
		return this.courseCategoryRepository.findAll();
	}

	public CourseCategoryModel getCourseCategoryById(long id) {
		Optional<CourseCategoryModel> courseCategory = courseCategoryRepository.findById(id);
		return courseCategory.isPresent() ? courseCategory.get() : null;
	}

	public CourseCategoryModel updateCourseCategory(CourseCategoryModel courseCategory) {
		return this.courseCategoryRepository.save(courseCategory);
	}

	public CourseCategoryModel addCourseCategory(CourseCategoryModel courseCategory) {
		return this.courseCategoryRepository.save(courseCategory);
	}

	public void deleteCourseCategory(long id) {
		this.courseCategoryRepository.deleteById(id);
	}

}
