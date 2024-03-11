package com.orientation.sujetOrientation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orientation.sujetOrientation.models.CourseModel;
@Repository
public interface CourseRepository extends JpaRepository<CourseModel,Long>{

}
