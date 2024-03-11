package com.orientation.sujetOrientation.services;

import java.util.List;

import com.orientation.sujetOrientation.models.CourseModel;

public interface CourseService {
	public List<CourseModel> getAllCourses();
	public CourseModel getCourseById(long id);
	public CourseModel updateCourse(CourseModel event);
	public CourseModel addCourse(CourseModel event);
	public void deleteCourse(long id);
}
