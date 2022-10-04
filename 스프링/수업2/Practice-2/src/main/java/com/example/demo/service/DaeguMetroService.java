package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.DaeguMetro;


public interface DaeguMetroService {

	public static final Integer LIMIT=10;
	public List<DaeguMetro> getDaeguMetros(Integer page);
	public void deleteDaeguMetro(int id, String line, String startStaion, String lastStaion, int stationNum);
	public DaeguMetro putDaeguMetro(DaeguMetro daeguMetro);
	public int getDaeguMetroSize();
}
