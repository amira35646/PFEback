package com.orientation.sujetOrientation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.orientation.sujetOrientation.models.EventModel;
@Repository
public interface EventRepository extends JpaRepository<EventModel,Long> {

}
