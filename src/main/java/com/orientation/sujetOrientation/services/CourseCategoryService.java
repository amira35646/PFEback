package com.orientation.sujetOrientation.services;

import java.util.List;

import com.orientation.sujetOrientation.models.CourseCategoryModel;


public interface CourseCategoryService {
	public List<CourseCategoryModel> getAllCourseCategories();
	public CourseCategoryModel getCourseCategoryById(long id);
	public CourseCategoryModel updateCourseCategory(CourseCategoryModel courseCategory);
	public CourseCategoryModel addCourseCategory(CourseCategoryModel courseCategory);
	public void deleteCourseCategory(long id);
}
