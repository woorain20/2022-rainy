package passionjava021;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDemo2 {
	public static void main(String[] args) {
		//현재 시각
		LocalDateTime today=LocalDateTime.of(2022,4,28,15,29);
		
		//항공편1의 출발시간
		LocalDateTime flight1=LocalDateTime.of(2022, 5,11,12,47);
		
		//항공편2의 출발시간
		LocalDateTime flight2=LocalDateTime.of(2022, 5,19,18,11);
		
		//빠른 항공편 선택과정
		LocalDateTime myFlight;
		if(flight1.isBefore(flight2)) {
			myFlight=flight1;
		}else {
			myFlight=flight2;
		}
		
		//빠른 항공편의 비행탑승까지 남은 날짜 계산
		Period day=Period.between(today.toLocalDate(), myFlight.toLocalDate());
		
		//빠른 항공편의 비행탑승까지 남은 시간 계산
		Duration time=Duration.between(today.toLocalTime(), myFlight.toLocalTime());
		
		//비행 탑승까지 남은 시간과 날짜 출력
		System.out.println(day);
		System.out.println(time);
		System.out.println();
		System.out.println(day+"일"+" "+time+"시간");
		System.out.println(day+" "+time);
		
		
	}

}
