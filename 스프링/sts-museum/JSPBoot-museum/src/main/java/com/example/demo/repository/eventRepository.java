package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.dto.Event;
import com.example.demo.dto.EventView;

@RepositoryRestResource(collectionResourceRel = "event", path="event",excerptProjection = EventView.class)
@CrossOrigin
public interface eventRepository extends JpaRepository<Event, Integer> {

}
