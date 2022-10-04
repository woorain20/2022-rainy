package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dao.SeoulMetroDao;
import com.example.demo.dto.SeoulMetro;

@SpringBootTest
public class SeoulMetroTest {

	@Autowired
	SeoulMetroDao seoulMetroDao;
	
	@Test
	void testSeoulMetro() {
		
		//입력 test
		SeoulMetro semt=new SeoulMetro();
//		semt.setLine("1호선");
//		semt.setStartStaion("소요산");
//		semt.setLastStaion("인천-신창-광명-서동탄");
//		semt.setStationNum(99);
		SeoulMetro savedsemt=seoulMetroDao.putSeoulMetro(semt);
		assertThat(semt).isEqualTo(savedsemt);
		
		//for문으로 여러개 입력
//		for(int i=0;i<30;i++) {
//			SeoulMetro semt=new SeoulMetro();
//			semt.setLine("test Line"+i);
//			semt.setStartStaion("test SS"+i);
//			semt.setLastStaion("test LS"+i);
//			semt.setStationNum(i);
//			seoulMetroDao.putSeoulMetro(semt);
//		}
		
		//조회 test
//		for(SeoulMetro sm:seoulMetroDao.getSeoulMetros()) {
//			System.out.println(sm);
//		}
		
		//limit 조회 test
//		for(SeoulMetro sm:seoulMetroDao.getSeoulMetroSome(2,7)) {	//(1,8) 첫 번째가 페이지 두 번째는 한 페이지당 나오는 수
//		System.out.println(sm);
//		}
		
		//게시물 수 조회 test
		//1, 4, 5번째 줄은 게시물 수가 같은지 조회하기 위한 코드
//		List<SeoulMetro> seoulMetros=seoulMetroDao.getSeoulMetros();
//		int totalSize=seoulMetroDao.getSeoulMetroSize();
//		System.out.println("totalsize: "+totalSize);
//		System.out.println(seoulMetros.size());
//		assertThat(seoulMetros.size()).isEqualTo(totalSize);
		
		//삭제 test
		//2번 째 줄 제외 나머지는 1개 삭제시 개수 확인
//		int totalSize1=seoulMetroDao.getSeoulMetroSize();
//		seoulMetroDao.deleteSeoulMetro(55);	//타입이 Long이어서 뒤에 L을 붙였음
//		int totalSize2=seoulMetroDao.getSeoulMetroSize();
//		assertThat(totalSize1-1).isEqualTo(totalSize2);
	}
}
