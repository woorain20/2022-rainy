package passionjava021;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {
	public static void main(String[] args) {
		//현재 날짜와 시각
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		System.out.println();
		
		//영국 바이어와 22시간 35분 뒤 화상 미팅 예정
		LocalDateTime firmt=dt.plusHours(22);
		firmt=firmt.plusMinutes(35);
		System.out.println(firmt);
		System.out.println();
		
		//1차 미팅 이후 2일 8시간 46분 뒤 미팅 예정
		LocalDateTime secmt=firmt.plusDays(2);
		secmt=secmt.plusHours(8);
		secmt=secmt.plusMinutes(46);
		System.out.println(secmt);
	}

}
