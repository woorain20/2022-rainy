package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.dto.PostBoard;
import com.example.demo.dto.PostBoardView;

@RepositoryRestResource(collectionResourceRel = "postboard", path="postboard", excerptProjection = PostBoardView.class)
@CrossOrigin
public interface postboardRepository extends JpaRepository<PostBoard, Integer> {

}
