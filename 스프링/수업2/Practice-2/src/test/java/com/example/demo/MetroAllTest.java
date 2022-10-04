package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dao.MetroAllDao;
import com.example.demo.dto.MetroAll;

@SpringBootTest
public class MetroAllTest {

	@Autowired
	MetroAllDao metroAllDao;
	
	@Test
	void testMetroAll() {
		//입력 test
		MetroAll meta=new MetroAll(); 
//		meta.setRegion("서울");
//		meta.setLine("1호선");
//		meta.setRegion("부산");
//		meta.setLine("1호선");
//		meta.setRegion("대구");
//		meta.setLine("1호선");
//		meta.setRegion("광주");
//		meta.setLine("1호선");
//		meta.setRegion("인천");
//		meta.setLine("1호선");
//		meta.setRegion("대전");
//		meta.setLine("1호선");
//		MetroAll savedmeta=metroAllDao.putMetroAll(meta);
//		assertThat(meta).isEqualTo(savedmeta);
	
	
		//for문으로 여러개 입력
//		for(int i=0;i<30;i++) {
//			MetroAll meta=new MetroAll();
//			meta.setRegion("test Region"+i);
//			meta.setLine("test Line"+i);
//			metroAllDao.putMetroAll(meta);
//		}
		
		//조회 test
//		for(MetroAll ma:metroAllDao.getMetroAlls()) {
//			System.out.println(ma);
//		}
		
		//limit 조회 test
//		for(MetroAll ma:metroAllDao.getMetroAllSome(2,7)) {	//(1,8) 첫 번째가 페이지 두 번째는 한 페이지당 나오는 수
//		System.out.println(ma);
//		}
		
		//게시물 수 조회 test
		//1, 4, 5번째 줄은 게시물 수가 같은지 조회하기 위한 코드
//		List<MetroAll> metroAlls=metroAllDao.getMetroAlls();
//		int totalSize=metroAllDao.getMetroAllSize();
//		System.out.println("totalsize: "+totalSize);
//		System.out.println(metroAlls.size());
//		assertThat(metroAlls.size()).isEqualTo(totalSize);
		
		//삭제 test
		//2번 째 줄 제외 나머지는 1개 삭제시 개수 확인
//		int totalSize1=metroAllDao.getMetroAllSize();
//		metroAllDao.deleteMetroAll(28);	//타입이 Long이어서 뒤에 L을 붙였음
//		int totalSize2=metroAllDao.getMetroAllSize();
//		assertThat(totalSize1-1).isEqualTo(totalSize2);
	}
}
