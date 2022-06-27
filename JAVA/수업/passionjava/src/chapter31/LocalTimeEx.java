package chapter31;

import java.time.Duration;
import java.time.LocalTime;

public class LocalTimeEx {
	public static void main(String[] args) {
		//현재 시각
		LocalTime now=LocalTime.now();
		System.out.println(now);
		
		//4시간 후에 약속
		LocalTime mt=now.plusHours(4);
		System.out.println(mt);
		
		//6시간 20분 후에 약속
		LocalTime th=now.plusHours(6);
		th=th.plusMinutes(20);
		System.out.println(th);
		
		LocalTime mt1=now;
		mt1=mt1.plusHours(6);
		mt1=mt1.plusMinutes(20);
		System.out.println(mt1);
		
		//현재시간
		LocalTime now1=LocalTime.now();
		System.out.println(now1);
		//점심시간
		LocalTime lunch=LocalTime.of(12, 40);
		//시간 차이 Duration
		Duration between=Duration.between(now1, lunch);
		System.out.println(between);
		System.out.println(between.toHours());
		System.out.println(between.toMinutes());
		
		//퇴근시간
		LocalTime fin=LocalTime.of(16, 40);
		Duration bet=Duration.between(now1, fin);
		System.out.println(bet.toHours());
		System.out.println(bet.toMinutes());
	}

}
