package chapter31;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;

public class InstantDemo {
	public static void main(String[] args) {
		//���� �ð�
		Instant start=Instant.now(); //Instant.now�� UTC�� ������
		//UTC ǥ�ؽ�
		System.out.println(start);
		//1970-01-01 00:00:00 ������ �ð��� �� ���� ���
		System.out.println(start.getEpochSecond());
		
		for(int i=0;i<10000000;i++) {
			i+=i;
		}
		Instant end=Instant.now();
		System.out.println(end.getEpochSecond());
		
		//�� �ð��� ���̸� ���(���� ����?)
		Duration between=Duration.between(start, end);
		System.out.println("�и� �� ���� ��: "+between.toMillis());	// �и��� ������ ��, 1��=1000�и���
		System.out.println("�� ���� ��: "+between.toMinutes());	// �� ������ ��
		
		//UTC�� �ƴ� �ѱ��� ǥ�ؽ�
		LocalDateTime now=LocalDateTime.now();
		System.out.println(now);
	}
	
}
