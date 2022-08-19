package com.example.demo.dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PostBoard {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer num;
	
	private String whiter;
	private	String title;
	private	LocalDate date;
	private String workplace;
	private	String content;
	private int count;
	private boolean official;

	private int password;
	
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getWhiter() {
		return whiter;
	}
	public void setWhiter(String whiter) {
		this.whiter = whiter;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getWorkplace() {
		return workplace;
	}
	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public boolean isOfficial() {
		return official;
	}
	public void setOfficial(boolean official) {
		this.official = official;
	}
	
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "PostBoard [num=" + num + ", whiter=" + whiter + ", title=" + title + ", date=" + date + ", workplace="
				+ workplace + ", content=" + content + ", count=" + count + ", official=" + official + ", password="
				+ password + "]";
	}
	
	
}
