package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.dto.Relic;


@RepositoryRestResource(collectionResourceRel = "relic", path="relic")
@CrossOrigin
public interface relicRepository extends JpaRepository<Relic, Integer> {

}
