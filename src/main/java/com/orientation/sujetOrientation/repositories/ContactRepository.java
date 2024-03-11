package com.orientation.sujetOrientation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orientation.sujetOrientation.models.ContactModel;

@Repository
public interface ContactRepository extends JpaRepository <ContactModel,Long>{

}
