package com.orientation.sujetOrientation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orientation.sujetOrientation.models.UniversityModel;
@Repository
public interface UniversityRepository extends JpaRepository<UniversityModel,Long> {

}
