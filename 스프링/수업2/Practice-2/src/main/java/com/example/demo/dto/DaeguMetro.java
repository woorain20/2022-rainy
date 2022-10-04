package com.example.demo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DaeguMetro {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String line;
	private String startStaion;
	private String lastStaion;
	private int stationNum;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public String getStartStaion() {
		return startStaion;
	}
	public void setStartStaion(String startStaion) {
		this.startStaion = startStaion;
	}
	public String getLastStaion() {
		return lastStaion;
	}
	public void setLastStaion(String lastStaion) {
		this.lastStaion = lastStaion;
	}
	public int getStationNum() {
		return stationNum;
	}
	public void setStationNum(int stationNum) {
		this.stationNum = stationNum;
	}
	
	@Override
	public String toString() {
		return "DaeguMetro [id=" + id + ", line=" + line + ", startStaion=" + startStaion + ", lastStaion=" + lastStaion
				+ ", stationNum=" + stationNum + "]";
	}
	
}
