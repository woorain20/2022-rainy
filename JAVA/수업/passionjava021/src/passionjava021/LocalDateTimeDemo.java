package passionjava021;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {
	public static void main(String[] args) {
		//���� ��¥�� �ð�
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		System.out.println();
		
		//���� ���̾�� 22�ð� 35�� �� ȭ�� ���� ����
		LocalDateTime firmt=dt.plusHours(22);
		firmt=firmt.plusMinutes(35);
		System.out.println(firmt);
		System.out.println();
		
		//1�� ���� ���� 2�� 8�ð� 46�� �� ���� ����
		LocalDateTime secmt=firmt.plusDays(2);
		secmt=secmt.plusHours(8);
		secmt=secmt.plusMinutes(46);
		System.out.println(secmt);
	}

}
