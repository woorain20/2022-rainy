package passionjava021;

import java.time.Duration;
import java.time.Instant;

public class InstantDemo {
	public static void main(String[] args) {
		Instant start=Instant.now();	//���� �ð� ������ ����
		System.out.println("����: "+start.getEpochSecond());
		System.out.println(start);
				
		for(int i=0;i<50000;i++) {
			i+=i;
		}
		System.out.println("Time files like an arrow");
		
		Instant end=Instant.now();	//���� �ð� ������ ����
		System.out.println("��: "+end.getEpochSecond());
		System.out.println(end);
		
		Duration between=Duration.between(start, end);	//�� �ð��� ���̸� ���
		System.out.println("�и� �� ���� ��: "+between.toMillis());
	}

}
