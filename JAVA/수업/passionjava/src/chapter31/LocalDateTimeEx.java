package chapter31;

import java.time.LocalDateTime;

public class LocalDateTimeEx {
	public static void main(String[] args) {
		//���� ��¥
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		
		//3�� 2�ð� 15�� �� ���
		LocalDateTime pro=dt;
		pro=pro.plusDays(3);
		pro=pro.plusHours(2);
		pro=pro.plusMinutes(15);
		System.out.println(pro);
	}

}
