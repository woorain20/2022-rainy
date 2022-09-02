package com.example.demo.dto;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="event=view", types=Event.class)
public interface EventView {

	Integer getNo();
	String getPlace();
	boolean getDone();
	String getstep();
	String getEventname();
	String getStartday();
	String getEndday();
	String getBanner();
	int getFee();
	String getTime();
	String getEmpty();
	String getContent();
}
