package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dto.SeoulStation;
import com.example.demo.service.impl.SeoulStationServiceImpl;

@SpringBootTest
public class SeoulStationTest2 {

	@Autowired
	SeoulStationServiceImpl sssi;
	
//	@Test
//	void testGetList() {
//		for(SeoulStation ss:sssi.getSeoulStation(0)) {
//			System.out.println(ss.toString());
//		}
//	}
	
//	@Test
//	void testDelete() {
//		sssi.deleteSeoulStation(13, "", "", "", "");
//	}
	
//	@Test
//	void testPut() {
//		SeoulStation seoulStation=new SeoulStation();
//		seoulStation.setStation("회룡");
//		seoulStation.setLine("1호선");
//		seoulStation.setCrossLine("의정부 경전철");
//		seoulStation.setAdjacency("의정부-망월사");
//		sssi.putSeoulStation(seoulStation);
//	}
	
//	@Test
//	void testGetSize() {
//		int total=sssi.getSeoulStationSize();
//		System.out.println(total);
//	}
}
