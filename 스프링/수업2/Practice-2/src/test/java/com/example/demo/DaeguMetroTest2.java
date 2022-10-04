package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dto.DaeguMetro;
import com.example.demo.service.impl.DaeguMetroServiceImpl;

@SpringBootTest
public class DaeguMetroTest2 {
	
	@Autowired
	DaeguMetroServiceImpl dmsi;
	
	@Test
	void testGetList() {
		for(DaeguMetro dm:dmsi.getDaeguMetros(0)) {
			System.out.println(dm.toString());
		}
	}
	
//	@Test
//	void testDelete() {
//		dmsi.deleteDaeguMetro(13, "", "", "", 0);
//	}
	
//	@Test
//	void testPut() {
//		DaeguMetro daeguMetro=new DaeguMetro();
//		daeguMetro.setLine("expo선");
//		daeguMetro.setStartStaion("");
//		daeguMetro.setLastStaion("");
//		daeguMetro.setStationNum(10);
//		dmsi.putDaeguMetro(daeguMetro);
//	}
	
//	@Test
//	void testGetSize() {
//		int total=dmsi.getDaeguMetroSize();
//		System.out.println(total);
//	}
	
}
