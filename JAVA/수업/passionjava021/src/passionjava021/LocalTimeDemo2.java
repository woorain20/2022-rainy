package passionjava021;

import java.time.Duration;
import java.time.LocalTime;

public class LocalTimeDemo2 {
	public static void main(String[] args) {
		//pc방 이용 시작 시각
		LocalTime start=LocalTime.of(12,24,35);
		System.out.println(start);
		System.out.println();
		
		//pc방 이용 종료 시각
		LocalTime end=LocalTime.of(17,44,27);
		System.out.println(end);
		System.out.println();
		
		//pc방 이용 시간 계산
		Duration between=Duration.between(start, end);
		double play=between.toMinutes();
		
		int play1=(int)play;
		
		System.out.println("이용시간: "+play1+"분");
		
		//pc방 이용 요금 계산
		double fee=0;
		double pay=0;
		
		fee=Math.floor(play1/60*1000);
		pay=Math.round(fee/100);
		
		int pay1=(int)pay;
		
		System.out.println("요금: "+pay1*100+"원");
		
	}
}
