package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dao.GuestbookDao;
import com.example.demo.dto.Guestbook;

@SpringBootTest
public class GBT {
	
	@Autowired
	GuestbookDao guestbookDao;
	
	@Test
	void testGBD() {
		//입력 test
//		Guestbook guestbook=new Guestbook();
//		guestbook.setContent("test content4");
//		guestbook.setName("test name4");
//		guestbook.setRegdate(new Date());
//		guestbookDao.putGuestbook(guestbook);
		
		//for문으로 여러개 입력
//		for(int i=0;i<30;i++) {
//			Guestbook guestbook=new Guestbook();
//			guestbook.setContent("test content"+i);
//			guestbook.setName("test name"+i);
//			guestbook.setRegdate(new Date());
//			guestbookDao.putGuestbook(guestbook);
//		}
		
		//조회 test
//		for(Guestbook gb:guestbookDao.getGuestbooks()) {
//			System.out.println(gb);
//		}
		
		//limit 조회 test
		for(Guestbook gb:guestbookDao.getGuestbooksSome(0,7)) {	//(1,8) 첫 번째가 페이지 두 번째는 한 페이지당 나오는 수
		System.out.println(gb);
		}
		
		//게시물 수 조회 test
		//1, 4, 5번째 줄은 게시물 수가 같은지 조회하기 위한 코드
//		List<Guestbook> guestbooks=guestbookDao.getGuestbooks();
//		Long totalSize=guestbookDao.getGuestbooksSize();
//		System.out.println("totalsize: "+totalSize);
//		System.out.println(guestbooks.size());
//		assertThat(guestbooks.size()).isEqualTo(totalSize.intValue());
		
		//삭제 test
		//2번 째 줄 제외 나머지는 1개 삭제시 개수 확인
//		Long totalSize1=guestbookDao.getGuestbooksSize();
//		guestbookDao.deleteGuestbook(28L);	//타입이 Long이어서 뒤에 L을 붙였음
//		Long totalSize2=guestbookDao.getGuestbooksSize();
//		assertThat(totalSize1-1).isEqualTo(totalSize2);
	}
}
