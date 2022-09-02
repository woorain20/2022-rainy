package com.example.demo.dto;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="main=view", types=mainpage.class)
public interface MainView {
	Integer getId();
	boolean getDone();
	String getPoster();
	String getLinkpage();

}
