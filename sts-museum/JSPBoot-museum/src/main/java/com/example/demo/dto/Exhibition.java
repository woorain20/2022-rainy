package com.example.demo.dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Exhibition {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String title;
	private boolean done;
	private boolean always;
	private String poster;
	private String linkpage;
	private String place;
	private LocalDate startday;
	private LocalDate endday;
	private String fee;
	private String content;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	public boolean isAlways() {
		return always;
	}
	public void setAlways(boolean always) {
		this.always = always;
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
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public LocalDate getStartday() {
		return startday;
	}
	public void setStartday(LocalDate startday) {
		this.startday = startday;
	}
	public LocalDate getEndday() {
		return endday;
	}
	public void setEndday(LocalDate endday) {
		this.endday = endday;
	}
	public String getFee() {
		return fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "Exhibition [id=" + id + ", title=" + title + ", done=" + done + ", always=" + always + ", poster="
				+ poster + ", linkpage=" + linkpage + ", place=" + place + ", startday=" + startday + ", endday="
				+ endday + ", fee=" + fee + ", content=" + content + "]";
	}
	

	
}
