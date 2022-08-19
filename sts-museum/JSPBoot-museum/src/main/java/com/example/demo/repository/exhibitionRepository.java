package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.dto.Exhibition;
import com.example.demo.dto.ExhibitionView;


@RepositoryRestResource(collectionResourceRel = "exhibition", path="exhibition",excerptProjection = ExhibitionView.class)
@CrossOrigin
public interface exhibitionRepository extends JpaRepository<Exhibition, Integer>{

}
