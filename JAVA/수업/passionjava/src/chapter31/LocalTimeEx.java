package chapter31;

import java.time.Duration;
import java.time.LocalTime;

public class LocalTimeEx {
	public static void main(String[] args) {
		//���� �ð�
		LocalTime now=LocalTime.now();
		System.out.println(now);
		
		//4�ð� �Ŀ� ���
		LocalTime mt=now.plusHours(4);
		System.out.println(mt);
		
		//6�ð� 20�� �Ŀ� ���
		LocalTime th=now.plusHours(6);
		th=th.plusMinutes(20);
		System.out.println(th);
		
		LocalTime mt1=now;
		mt1=mt1.plusHours(6);
		mt1=mt1.plusMinutes(20);
		System.out.println(mt1);
		
		//����ð�
		LocalTime now1=LocalTime.now();
		System.out.println(now1);
		//���ɽð�
		LocalTime lunch=LocalTime.of(12, 40);
		//�ð� ���� Duration
		Duration between=Duration.between(now1, lunch);
		System.out.println(between);
		System.out.println(between.toHours());
		System.out.println(between.toMinutes());
		
		//��ٽð�
		LocalTime fin=LocalTime.of(16, 40);
		Duration bet=Duration.between(now1, fin);
		System.out.println(bet.toHours());
		System.out.println(bet.toMinutes());
	}

}
