package com.example.demo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class mainpage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private boolean done;
	private String poster;
	private String linkpage;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getLinkpage() {
		return linkpage;
	}
	public void setLinkpage(String linkpage) {
		this.linkpage = linkpage;
	}
	
	@Override
	public String toString() {
		return "mainpage [id=" + id + ", done=" + done + ", poster=" + poster + ", linkpage=" + linkpage + "]";
	}
	

}
