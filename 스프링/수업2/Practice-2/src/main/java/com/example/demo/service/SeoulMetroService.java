package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.SeoulMetro;

public interface SeoulMetroService {

	public static final Integer LIMIT=10;
	public List<SeoulMetro> getSeoulMetros(Integer page);
	public void deleteSeoulMetro(int id, String line, String startStaion, String lastStaion, int stationNum);
	public SeoulMetro putSeoulMetro(SeoulMetro seoulMetro);
	public int getSeoulMetroSize();
}
