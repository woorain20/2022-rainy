package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.demo.dto.PostBoard;
import com.example.demo.repository.postboardRepository;

public class PostBoardDao {
	
	@Autowired
	private postboardRepository postboardrepository;
	
	public PostBoard putPostBoard(PostBoard postboard) {
		return postboardrepository.saveAndFlush(postboard);
	}
	public List<PostBoard> getPostBoard(){
		return postboardrepository.findAll();
	}
	
	public List<PostBoard> getPostBoardSome(Integer page, Integer limit){
		Pageable pageable = PageRequest.of(page, limit,Sort.by("id").descending());
		return postboardrepository.findAll(pageable).getContent();
	}
	
	public Long getGuestbookSize() {
		return postboardrepository.count();
	}

}
