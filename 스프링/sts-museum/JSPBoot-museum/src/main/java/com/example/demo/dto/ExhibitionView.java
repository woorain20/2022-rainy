package com.example.demo.dto;

import java.time.LocalDate;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="exhibi=view", types=Exhibition.class)
public interface ExhibitionView {

	Integer getId();
	String getTitle();
	boolean getDone();
	boolean getAlways();
	String getPoster();
	String getLinkpage();
	String getPlace();
	LocalDate getStartday();
	LocalDate getEndday();
	String getFee();
	String getContent();
}
