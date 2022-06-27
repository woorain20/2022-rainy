package passionjava021;

import java.time.LocalTime;

public class LocalTimeDemo {
	public static void main(String[] args) {
		//현재 시각
		LocalTime now=LocalTime.now();
		System.out.println(now);
		System.out.println();
		
		//1시간 40분뒤 미팅 예정
		LocalTime mt=now.plusHours(1);
		mt=mt.plusMinutes(40);
		//화상 미팅 시각
		System.out.println("화상미팅: "+mt);
		System.out.println();
		//미팅 시작 2시간 20분뒤 회식 예정
		LocalTime di=mt.plusHours(2);
		di=di.plusMinutes(20);
		//회식 시각
		System.out.println("회식: "+di);
		
	}
}
