package com.orientation.sujetOrientation.controllers;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.orientation.sujetOrientation.models.CourseCategoryImages;
import com.orientation.sujetOrientation.models.CourseCategoryModel;

import com.orientation.sujetOrientation.services.CourseCategoryService;

@RestController
@RequestMapping("api/courseCategory")
@CrossOrigin("*")
public class CourseCategoryController {
	@Autowired
	private CourseCategoryService courseCategoryService;
	@GetMapping
	public List<CourseCategoryModel> getAllCourseCategories(){
		return this.courseCategoryService.getAllCourseCategories();
	}
	@GetMapping("/{id}")
	public CourseCategoryModel getCourseCategoryById(@PathVariable long id){
		return this.courseCategoryService.getCourseCategoryById(id);
	}
	@PostMapping(value={"/create"},consumes= {MediaType.MULTIPART_FORM_DATA_VALUE})
	public CourseCategoryModel addCourseCategory(@RequestPart("course_category") CourseCategoryModel courseCategory,
			@RequestPart("imageFile")MultipartFile [] file) {
			try {
			Set<CourseCategoryImages> images =uploadImage(file);
			courseCategory.setCourseCategoryImages(images);
			return this.courseCategoryService.addCourseCategory(courseCategory);
		} catch(Exception e ) {
			return null;
		}
	}
	public Set<CourseCategoryImages> uploadImage(MultipartFile[] multipartFiles) throws IOException {
		  Set<CourseCategoryImages> imageModels = new HashSet<>();
		  for (MultipartFile file : multipartFiles) {
			  CourseCategoryImages imageModel = new CourseCategoryImages(
		      file.getOriginalFilename(),
		      file.getContentType(),
		      file.getBytes()
		    );
		    imageModels.add(imageModel);
		  }
		  return imageModels;
		}
	@PutMapping("/update")
	public CourseCategoryModel updateCourseCategory(@RequestBody CourseCategoryModel courseCategory) {
		return this.courseCategoryService.updateCourseCategory(courseCategory);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteCourseCategory(@PathVariable long id) {
		this.courseCategoryService.deleteCourseCategory(id);
	}
	
}
