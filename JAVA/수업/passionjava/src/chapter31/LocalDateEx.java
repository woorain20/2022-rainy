package chapter31;

import java.time.LocalDate;

public class LocalDateEx {
	public static void main(String[] args) {
		//오늘
		LocalDate today=LocalDate.now();
		System.out.println(today);
		//특정한 날
//		String xmas1="2022-12-25";
		LocalDate xmas=LocalDate.of(2022, 12, 25);
		System.out.println(xmas);
		System.out.println(today.getYear()); 	//연도만 가져올 수 있음
		System.out.println(today.getMonth());	//달만 가져올 수 있음
		System.out.println(today.getDayOfWeek());	//요일을 가져올 수 있음
		//이브
		LocalDate eve=xmas.minusDays(1);	//원하는 일자를 빼줌
		System.out.println(eve);
		
		//오늘부터 1일 - 100일
		LocalDate hundred=today.plusDays(100);
		System.out.println(hundred);
	}

}
