package operate;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ViewCheckIn {

	LocalDate ld=LocalDate.now();
		//üũ�� ��¥
	public void CheckInYear(int year) {
		//�⵵ ���ڿ� ����ó��		
		//���� �ð����� ���� ��¥ ó�� �Ұ�
		if(ld.getYear()<=year){
			System.out.println(year+"��");		
			System.out.println("���� �������ּ���");
		}else {
			System.out.println("������ �� �����ϴ�.");
		}
			
	}
	public void CheckInMonth(int month) {
		//�� ���ڿ� ����ó��
		if(month<=12) {
			System.out.println(month+"��");
			System.out.println("���� �������ּ���");
		}else {
			System.out.println("������ �� �����ϴ�.");
		}
		
	}
	
	public void CheckInDay(int day) {
		//�� ���ڿ� ����ó��
		if(day<=31) {
			System.out.println(day+"��");
		}else {
			System.out.println("�Ⱓ�� �´� ���ڸ� �������ּ���");
		}
	}


}
