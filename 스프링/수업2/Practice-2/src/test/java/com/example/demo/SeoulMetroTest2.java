package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dto.SeoulMetro;
import com.example.demo.service.impl.SeoulMetroServiceImpl;

@SpringBootTest
public class SeoulMetroTest2 {

	@Autowired
	SeoulMetroServiceImpl smsi;
	
	@Test
	void testGetList() {
		for(SeoulMetro sm:smsi.getSeoulMetros(0)) {
			System.out.println(sm.toString());
		}
	}
	
//	@Test
//	void testDelete() {
//		smsi.deleteSeoulMetro(13, "", "", "", 0);
//	}
	
//	@Test
//	void testPut() {
//		SeoulMetro seoulMetro=new SeoulMetro();
//		seoulMetro.setLine("9호선");
//		seoulMetro.setStartStaion("개화");
//		seoulMetro.setLastStaion("중앙보훈병원");
//		seoulMetro.setStationNum(38);
//		smsi.putSeoulMetro(seoulMetro);
//	}
	
//	@Test
//	void testGetSize() {
//		int total=smsi.getSeoulMetroSize();
//		System.out.println(total);
//	}
}
