package passionjava021;

import java.time.LocalDate;
import java.time.Period;

public class LocalDateDemo2 {
	public static void main(String[] args) {
		//오늘
		LocalDate today=LocalDate.now();
		System.out.println(today+"\n");
		
		//올해 크리스마스
		LocalDate xmas=LocalDate.of(today.getYear(), 12, 25);
		System.out.println(xmas+"\n");
		
		//크리스마스까지 며칠?
		Period left=Period.between(today, xmas);
		System.out.println(left.getMonths()+"개월"+left.getDays()+"일");

	}

}
