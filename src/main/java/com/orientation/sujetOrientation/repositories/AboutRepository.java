package com.orientation.sujetOrientation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orientation.sujetOrientation.models.AboutModel;

@Repository
public interface AboutRepository extends JpaRepository<AboutModel,Long>{

}
