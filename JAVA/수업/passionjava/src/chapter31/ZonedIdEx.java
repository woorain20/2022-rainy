package chapter31;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedIdEx {
	public static void main(String[] args) {
		//프랑스 파리
		ZoneId paris=ZoneId.of("Europe/Paris");
		System.out.println(paris);
		
		//현재 시각
		ZonedDateTime here=ZonedDateTime.now();
		System.out.println(here);
		System.out.println(here.toLocalDateTime());
		ZonedDateTime parisTime=ZonedDateTime.of(here.toLocalDateTime(), paris);
		ZonedDateTime parisTime1=here.withZoneSameInstant(paris);
		System.out.println(parisTime);
		System.out.println(parisTime1);
	}
}
