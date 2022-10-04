package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dao.DaeguMetroDao;
import com.example.demo.dto.DaeguMetro;

@SpringBootTest
public class DaeguMetroTest {

	@Autowired
	DaeguMetroDao daeguMetroDao;
	
	@Test
	void testDaeguMetro() {
		
		//입력 test
//		DaeguMetro damt=new DaeguMetro();
//		damt.setLine("1호선");
//		damt.setStartStaion("설화명곡");
//		damt.setLastStaion("안심");
//		damt.setStationNum(32);
//		damt.setLine("2호선");
//		damt.setStartStaion("문양");
//		damt.setLastStaion("영남대");
//		damt.setStationNum(29);
//		damt.setLine("3호선");
//		damt.setStartStaion("칠곡경대병원");
//		damt.setLastStaion("용지");
//		damt.setStationNum(30);
//		DaeguMetro saveddamt=daeguMetroDao.putDaeguMetro(damt);
//		assertThat(damt).isEqualTo(saveddamt);
		
		//for문으로 여러개 입력
//		for(int i=0;i<30;i++) {
//			DaeguMetro damt=new DaeguMetro();
//			damt.setLine("test Line"+i);
//			damt.setStartStaion("test SS"+i);
//			damt.setLastStaion("test LS"+i);
//			damt.setStationNum(i);
//			daeguMetroDao.putDaeguMetro(damt);
//		}
		
		//조회 test
//		for(DaeguMetro dm:daeguMetroDao.getDaeguMetros()) {
//			System.out.println(dm);
//		}
		
		//limit 조회 test
//		for(DaeguMetro dm:daeguMetroDao.getDaeguMetroSome(2,7)) {	//(1,8) 첫 번째가 페이지 두 번째는 한 페이지당 나오는 수
//		System.out.println(dm);
//		}
		
		//게시물 수 조회 test
		//1, 4, 5번째 줄은 게시물 수가 같은지 조회하기 위한 코드
//		List<DaeguMetro> daeguMetros=daeguMetroDao.getDaeguMetros();
//		int totalSize=daeguMetroDao.getDaeguMetroSize();
//		System.out.println("totalsize: "+totalSize);
//		System.out.println(daeguMetros.size());
//		assertThat(daeguMetros.size()).isEqualTo(totalSize);
		
		//삭제 test
		//2번 째 줄 제외 나머지는 1개 삭제시 개수 확인
//		int totalSize1=daeguMetroDao.getDaeguMetroSize();
//		daeguMetroDao.deleteDaeguMetro(28);	//타입이 Long이어서 뒤에 L을 붙였음
//		int totalSize2=daeguMetroDao.getDaeguMetroSize();
//		assertThat(totalSize1-1).isEqualTo(totalSize2);
	}
}
