package passionjava021;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DurationDemo {
	public static void main(String[] args) {
		LocalDateTime dt1=LocalDateTime.of(2022, Month.AUGUST, 12,15,30);
		LocalDateTime dt2=LocalDateTime.of(2022, Month.FEBRUARY, 12,15,30);
		
		LocalDateTime dt3=LocalDateTime.of(2022, Month.AUGUST, 12,15,30);
		LocalDateTime dt4=LocalDateTime.of(2022, Month.FEBRUARY, 13,14,29);
		
//		Duration drDate=Duration.between(dt1, dt2);
//		System.out.println(drDate);
//		
//		Duration drDate2=Duration.between(dt3, dt4);
//		System.out.println(drDate2);
		
		DateTimeFormatter fm=DateTimeFormatter.ofPattern("yyyy-MM-dd, HH:mm");
		System.out.println(dt1.format(fm));
		DateTimeFormatter fm2=DateTimeFormatter.ofPattern("yyyy-MM-dd, HH:mm");
		System.out.println(dt2.format(fm2));
		DateTimeFormatter fm3=DateTimeFormatter.ofPattern("yyyy-MM-dd, HH:mm");
		System.out.println(dt3.format(fm3));
		DateTimeFormatter fm4=DateTimeFormatter.ofPattern("yyyy-MM-dd, HH:mm");
		System.out.println(dt4.format(fm4));
		System.out.println();
		
		Duration drDateV=Duration.between(dt1, dt2);
		System.out.println(drDateV);
		Duration drDateV2=Duration.between(dt3, dt4);
		System.out.println(drDateV2);
	}

}
