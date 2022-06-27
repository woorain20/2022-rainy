package passionjava021;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {
	public static void main(String[] args) {
		//�̰��� ���� ��¥�� �ð�
		ZonedDateTime here=ZonedDateTime.now();
		System.out.println(here);
		
		//������ ��¥�� �ð��� �ĸ�
		ZonedDateTime paris=ZonedDateTime.of(here.toLocalDateTime(), ZoneId.of("Europe/Paris"));
		System.out.println(paris);
		
		//�̰��� �ĸ��� ����
		Duration diff=Duration.between(here, paris);
		System.out.println(diff);

		
	}

}
