package passionjava021;

import java.time.Duration;
import java.time.LocalTime;

public class LocalTimeDemo2 {
	public static void main(String[] args) {
		//pc�� �̿� ���� �ð�
		LocalTime start=LocalTime.of(12,24,35);
		System.out.println(start);
		System.out.println();
		
		//pc�� �̿� ���� �ð�
		LocalTime end=LocalTime.of(17,44,27);
		System.out.println(end);
		System.out.println();
		
		//pc�� �̿� �ð� ���
		Duration between=Duration.between(start, end);
		double play=between.toMinutes();
		
		int play1=(int)play;
		
		System.out.println("�̿�ð�: "+play1+"��");
		
		//pc�� �̿� ��� ���
		double fee=0;
		double pay=0;
		
		fee=Math.floor(play1/60*1000);
		pay=Math.round(fee/100);
		
		int pay1=(int)pay;
		
		System.out.println("���: "+pay1*100+"��");
		
	}
}
