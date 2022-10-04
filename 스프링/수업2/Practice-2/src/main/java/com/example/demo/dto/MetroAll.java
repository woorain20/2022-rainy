package com.example.demo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MetroAll {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String region;
	private String line;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	
	@Override
	public String toString() {
		return "MetroAll [id=" + id + ", region=" + region + ", line=" + line + "]";
	}
	
}
