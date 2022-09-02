package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.dto.MainView;
import com.example.demo.dto.mainpage;

@RepositoryRestResource(collectionResourceRel = "mainpage", path="mainpage",excerptProjection = MainView.class)
@CrossOrigin
public interface mainRepository extends JpaRepository<mainpage, Integer>{

}
