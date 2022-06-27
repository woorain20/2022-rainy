package chapter31;

import java.time.LocalDateTime;

public class LocalDateTimeEx {
	public static void main(String[] args) {
		//현재 날짜
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		
		//3일 2시간 15분 뒤 약속
		LocalDateTime pro=dt;
		pro=pro.plusDays(3);
		pro=pro.plusHours(2);
		pro=pro.plusMinutes(15);
		System.out.println(pro);
	}

}
