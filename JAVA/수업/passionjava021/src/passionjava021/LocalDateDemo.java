package passionjava021;

import java.time.LocalDate;

public class LocalDateDemo {
	public static void main(String[] args) {
		//오늘
		LocalDate today=LocalDate.now();
		System.out.println(today+"\n");
		
		//올해 크리스마스
		LocalDate xmas=LocalDate.of(today.getYear(), 12, 25);
		System.out.println(xmas+"\n");
		
		//올해 크리스마스 이브
		LocalDate eve=xmas.minusDays(1);
		System.out.println(eve);
	}

}
