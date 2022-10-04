package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.MetroAll;

public interface MetroAllService {

	public static final Integer LIMIT=10;
	public List<MetroAll> getMetroAlls(Integer page);
	public void deleteMetroAll(int id, String region, String line);
	public MetroAll putMetroAll(MetroAll metroAll);
	public int getMetroAllSize();
}
