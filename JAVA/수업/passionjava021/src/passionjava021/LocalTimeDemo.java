package passionjava021;

import java.time.LocalTime;

public class LocalTimeDemo {
	public static void main(String[] args) {
		//���� �ð�
		LocalTime now=LocalTime.now();
		System.out.println(now);
		System.out.println();
		
		//1�ð� 40�е� ���� ����
		LocalTime mt=now.plusHours(1);
		mt=mt.plusMinutes(40);
		//ȭ�� ���� �ð�
		System.out.println("ȭ�����: "+mt);
		System.out.println();
		//���� ���� 2�ð� 20�е� ȸ�� ����
		LocalTime di=mt.plusHours(2);
		di=di.plusMinutes(20);
		//ȸ�� �ð�
		System.out.println("ȸ��: "+di);
		
	}
}
