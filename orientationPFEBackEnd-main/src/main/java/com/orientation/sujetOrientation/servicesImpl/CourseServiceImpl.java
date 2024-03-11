package com.orientation.sujetOrientation.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orientation.sujetOrientation.models.CourseModel;
import com.orientation.sujetOrientation.repositories.CourseRepository;
import com.orientation.sujetOrientation.services.CourseService;

@Service
public class CourseServiceImpl implements CourseService {
@Autowired
private CourseRepository courseRepository;
	public List<CourseModel> getAllCourses() {
		return this.courseRepository.findAll();
	}

	public CourseModel getCourseById(long id) {
		Optional<CourseModel> course = courseRepository.findById(id);
		return course.isPresent() ? course.get() : null;
	}

	public CourseModel updateCourse(CourseModel course) {
		return this.courseRepository.save(course);
	}

	public CourseModel addCourse(CourseModel course) {
		return this.courseRepository.save(course);
	}

	public void deleteCourse(long id) {
		this.courseRepository.deleteById(id);
		
	}

}
