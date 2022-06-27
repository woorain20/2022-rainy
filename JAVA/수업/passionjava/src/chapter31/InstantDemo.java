package chapter31;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;

public class InstantDemo {
	public static void main(String[] args) {
		//현재 시각
		Instant start=Instant.now(); //Instant.now는 UTC를 가져옴
		//UTC 표준시
		System.out.println(start);
		//1970-01-01 00:00:00 지나온 시간을 초 단위 계산
		System.out.println(start.getEpochSecond());
		
		for(int i=0;i<10000000;i++) {
			i+=i;
		}
		Instant end=Instant.now();
		System.out.println(end.getEpochSecond());
		
		//두 시각의 차이를 계산(오류 없이?)
		Duration between=Duration.between(start, end);
		System.out.println("밀리 초 단위 차: "+between.toMillis());	// 밀리초 단위의 차, 1초=1000밀리초
		System.out.println("분 단위 차: "+between.toMinutes());	// 분 단위의 차
		
		//UTC가 아닌 한국의 표준시
		LocalDateTime now=LocalDateTime.now();
		System.out.println(now);
	}
	
}
