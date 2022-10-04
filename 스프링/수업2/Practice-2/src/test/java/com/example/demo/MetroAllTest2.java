package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dto.MetroAll;
import com.example.demo.service.impl.MetroAllServiceImpl;

@SpringBootTest
public class MetroAllTest2 {

	@Autowired
	MetroAllServiceImpl masi;
	
	@Test
	void testGetList() {
		for(MetroAll ma:masi.getMetroAlls(0)) {
			System.out.println(ma.toString());
		}
	}
	
//	@Test
//	void testDelete() {
//		masi.deleteMetroAll(30, "서울", "9호선");
//	}
	
//	@Test
//	void testPut() {
//		MetroAll metroAll=new MetroAll();
//		metroAll.setRegion("서울");
//		metroAll.setLine("9호선");
//		masi.putMetroAll(metroAll);
//	}
	
//	@Test
//	void testGetSize() {
//		int total=masi.getMetroAllSize();
//		System.out.println(total);
//	}
}
