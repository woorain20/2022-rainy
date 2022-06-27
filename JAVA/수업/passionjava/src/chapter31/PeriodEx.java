package chapter31;

import java.time.LocalDate;
import java.time.Period;

public class PeriodEx {
	public static void main(String[] args) {
		//오늘부터 크리스마스까지 며칠?
		
		//오늘
		LocalDate today=LocalDate.now();
		System.out.println(today);
		
		//올 해의 크리스마스
		LocalDate xmas=LocalDate.of(today.getYear(), 12, 25);
		System.out.println(xmas);
		
		//특정 해의 크리스마스
		LocalDate xmas2=LocalDate.of(2024, 12, 25);
		System.out.println(xmas2);
		
		//크리스마스까지 며칠?
		Period left=Period.between(today, xmas);
		Period left2=Period.between(today, xmas2);
		System.out.println(left.getMonths()+"월"+left.getDays()+"일");
		System.out.println(left2.getYears()+"년"+left2.getMonths()+"월"+left2.getDays()+"일");
	}
}
