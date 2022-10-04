package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.dto.Todo;
import com.example.demo.dto.TodoView;

@RepositoryRestResource(collectionResourceRel = "todos", path="todos", excerptProjection = TodoView.class)	//CRUD 자동으로 됨
@CrossOrigin	//모든 곳에서 접속 허용을 함 ()안에 접속제한 할 곳을 넣을 수 있음
public interface TodoRepository extends JpaRepository<Todo, Integer> {

}
