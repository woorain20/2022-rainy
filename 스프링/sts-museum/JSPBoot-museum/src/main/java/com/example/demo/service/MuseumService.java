package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.PostBoard;

public interface MuseumService {
	
	public static final Integer LIMIT = 8;
	
	public List<PostBoard> getGuestbooks(Integer page);
	
	public void deletePostBoard(Integer id);
	
	public PostBoard putPostBoard(PostBoard postboard);
	
	public int getPostBoardSize();

}
