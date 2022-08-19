package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.dto.MuseumList;

@RepositoryRestResource(collectionResourceRel = "museumlist", path="museumlist")
@CrossOrigin
public interface MuseumListRepository extends JpaRepository<MuseumList, Integer> {

}
