package passionjava021;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDemo2 {
	public static void main(String[] args) {
		//���� �ð�
		LocalDateTime today=LocalDateTime.of(2022,4,28,15,29);
		
		//�װ���1�� ��߽ð�
		LocalDateTime flight1=LocalDateTime.of(2022, 5,11,12,47);
		
		//�װ���2�� ��߽ð�
		LocalDateTime flight2=LocalDateTime.of(2022, 5,19,18,11);
		
		//���� �װ��� ���ð���
		LocalDateTime myFlight;
		if(flight1.isBefore(flight2)) {
			myFlight=flight1;
		}else {
			myFlight=flight2;
		}
		
		//���� �װ����� ����ž�±��� ���� ��¥ ���
		Period day=Period.between(today.toLocalDate(), myFlight.toLocalDate());
		
		//���� �װ����� ����ž�±��� ���� �ð� ���
		Duration time=Duration.between(today.toLocalTime(), myFlight.toLocalTime());
		
		//���� ž�±��� ���� �ð��� ��¥ ���
		System.out.println(day);
		System.out.println(time);
		System.out.println();
		System.out.println(day+"��"+" "+time+"�ð�");
		System.out.println(day+" "+time);
		
		
	}

}
