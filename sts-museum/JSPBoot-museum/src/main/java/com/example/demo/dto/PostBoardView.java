package com.example.demo.dto;

import java.time.LocalDate;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="postboard=view", types=PostBoard.class)
public interface PostBoardView {
			
			Integer getNum();
			String getWhiter();
			String getTitle();
			LocalDate getDate();
			String getWorkplace();
			String getContent();
			int getCount();
			boolean getOfficial();
			int getPassword();

}
