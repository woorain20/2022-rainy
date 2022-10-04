package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dao.SeoulStationDao;
import com.example.demo.dto.SeoulStation;

@SpringBootTest
public class SeoulStationTest {

	@Autowired
	SeoulStationDao seoulStationDao;
	
	@Test
	void testSeoulStation() {
		
		//입력 test
//		SeoulStation sest=new SeoulStation();
//		sest.setStation("지행");
//		sest.setLine("1호선");
//		sest.setCrossLine("");
//		sest.setAdjacency("동두천중앙-덕정");
//		SeoulStation savedsest=seoulStationDao.putSeoulStation(sest);
//		assertThat(sest).isEqualTo(savedsest);
		
		//for문으로 여러개 입력
//		for(int i=0;i<30;i++) {
//			SeoulStation sest=new SeoulStation();
//			sest.setStation("test Station"+i);
//			sest.setLine("test SL"+i);
//			sest.setCrossLine("test CL"+i);
//			sest.setAdjacency("test adjacency"+i);
//			seoulStationDao.putSeoulStation(sest);
//		}
		
		//조회 test
//		for(SeoulStation ss:seoulStationDao.getSeoulStations()) {
//			System.out.println(ss);
//		}
		
		//limit 조회 test
//		for(SeoulStation ss:seoulStationDao.getSeoulStationSome(2,7)) {	//(1,8) 첫 번째가 페이지 두 번째는 한 페이지당 나오는 수
//		System.out.println(ss);
//		}
		
		//게시물 수 조회 test
		//1, 4, 5번째 줄은 게시물 수가 같은지 조회하기 위한 코드
//		List<SeoulStation> seoulStations=seoulStationDao.getSeoulStations();
//		int totalSize=seoulStationDao.getSeoulStationSize();
//		System.out.println("totalsize: "+totalSize);
//		System.out.println(seoulStations.size());
//		assertThat(seoulStations.size()).isEqualTo(totalSize);
		
		//삭제 test
		//2번 째 줄 제외 나머지는 1개 삭제시 개수 확인
//		int totalSize1=seoulStationDao.getSeoulStationSize();
//		seoulStationDao.deleteSeoulStation(42);	//타입이 Long이어서 뒤에 L을 붙였음
//		int totalSize2=seoulStationDao.getSeoulStationSize();
//		assertThat(totalSize1-1).isEqualTo(totalSize2);
	}
}
