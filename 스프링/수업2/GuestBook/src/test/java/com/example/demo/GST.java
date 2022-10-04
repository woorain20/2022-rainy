package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dto.Guestbook;
import com.example.demo.service.impl.GuestbookServiceImpl;

@SpringBootTest
public class GST {

	@Autowired
	GuestbookServiceImpl guestbookServiceImpl;
	
	@Test
	void testGetList() {
		for(Guestbook g:guestbookServiceImpl.getGuestbooks(0)) {
			System.out.println(g.toString());
		}
	}
	
//	@Test
//	void testDelete() {
//		guestbookServiceImpl.deleteGuestbook(18L, "test ip1");
//	}
	
//	@Test
//	void testPut() {
//		Guestbook guestbook=new Guestbook();
//		guestbook.setName("GST name1");
//		guestbook.setContent("GST con1");
//		guestbookServiceImpl.putGuestbook(guestbook, "GST ip1");
//	}
	
	@Test
	void testGetSize() {
		int total=guestbookServiceImpl.getGuestbookSize();
		System.out.println(total);
	}
}
