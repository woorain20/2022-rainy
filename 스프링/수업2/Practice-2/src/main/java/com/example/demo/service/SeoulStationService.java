package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.SeoulStation;

public interface SeoulStationService {

	public static final Integer LIMIT=10;
	public List<SeoulStation> getSeoulStation(Integer page);
	public void deleteSeoulStation(int id, String station, String line, String crossLine, String adjacency);
	public SeoulStation putSeoulStation(SeoulStation seoulStation);
	public int getSeoulStationSize();
}
