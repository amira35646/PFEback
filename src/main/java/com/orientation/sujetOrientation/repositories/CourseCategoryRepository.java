package com.orientation.sujetOrientation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orientation.sujetOrientation.models.CourseCategoryModel;

@Repository
public interface CourseCategoryRepository extends JpaRepository<CourseCategoryModel,Long>{

}
