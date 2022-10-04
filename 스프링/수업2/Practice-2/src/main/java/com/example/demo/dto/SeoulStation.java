package com.example.demo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SeoulStation {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String station;
	private String line;
	private String crossLine;
	private String adjacency;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStation() {
		return station;
	}
	public void setStation(String station) {
		this.station = station;
	}
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public String getCrossLine() {
		return crossLine;
	}
	public void setCrossLine(String crossLine) {
		this.crossLine = crossLine;
	}
	public String getAdjacency() {
		return adjacency;
	}
	public void setAdjacency(String adjacency) {
		this.adjacency = adjacency;
	}
	
	@Override
	public String toString() {
		return "SeoulStation [id=" + id + ", station=" + station + ", line=" + line + ", crossLine=" + crossLine
				+ ", adjacency=" + adjacency + "]";
	}
	
	
}
