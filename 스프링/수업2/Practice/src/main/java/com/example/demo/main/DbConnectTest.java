package com.example.demo.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.config.AppConfig;
import com.example.demo.dao.LeagueDao;
import com.example.demo.dto.League;

public class DbConnectTest {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		LeagueDao leagueDao=ac.getBean(LeagueDao.class);
		
		List<League> list=leagueDao.selectAll();
		//idleague -> idleague 자동변환해서 매칭시킴
		for(League league:list) {
			System.out.println(league);
		}
		
		//한 건 입력
//		League league1=new League();
//		league1.setIdleague(9);
//		league1.setLeague("SPL");
//		league1.setNation("스코틀랜드");
//		league1.setFound(2013);
//		int count=leagueDao.insert(league1);
//		System.out.println(count+"건 입력하였습니다.");
		
		//수정
//		League league2=new League();
//		league2.setIdleague(8);
//		league2.setLeague("K-League");
//		league2.setNation("대한민국");
//		league2.setFound(1983);
//		int uCount=LeagueDao.update(league2);
//		System.out.println(uCount+"건 수정하였습니다.");
		
//		//1건 read
//		League league3=leagueDao.setIdleague(5);
//		if(league3!=null) {
//			System.out.println(league3);
//		}else {
//			System.out.println("찾을 수 없습니다.");
//		}
		
		//Delete 전 Test용 data 입력
//		for(int i=0;i<6;i++) {
//			League league1=new League();
//			league1.setIdleague(100+i);
//			leauge1.setLeague("Test"+i);
//			league1.setNation("Test"+i);
//			league1.setFound(1800+i);
//			leagueDao.insert(league1);
//		}
		
		//1건 삭제
//		int dCount=leagueDao.deleteById(101);
//		System.out.println(dCount+"건 삭제하였습니다.");
	}
}
