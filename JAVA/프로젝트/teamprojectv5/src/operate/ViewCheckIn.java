package operate;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;



public class ViewCheckIn {

	LocalDate ld=LocalDate.now();
		//üũ�� ��¥
		public void CheckIn(int year, int month, int day) {

			//�⵵ ���ڿ� ����ó��
			while(true) {			
				try {
					while(true) {
						System.out.println("�⵵�� �������ּ���");
						//���� �ð����� ���� ��¥ ó�� �Ұ�
						if(ld.getYear()<=year){
							System.out.println(year+"��");		
							break;
						}else {
							System.out.println("���ų�¥�� ������ �� �����ϴ�.");
						}
					}
				}catch(InputMismatchException e) {
					System.out.println("���ڸ� �Է����ּ���.");
					continue;
				}
				break;
			}	
			//�� ���ڿ� ����ó��
			while(true) {	
				try {
					while(true) {
						System.out.println("���� �������ּ���");
						if(month<=12) {
							System.out.println(month+"��");
							break;
						}else {
							System.out.println("1~12�� �߿� �������ּ���.");
						}
					}
				}catch(InputMismatchException e) {
					System.out.println("���ڸ� �Է����ּ���");
					continue;
				}
				break;
			}	
			//�� ���ڿ� ����ó��
			while(true) {
				try {
					System.out.println("���� �������ּ���");
					while(true) {
						if(day<=31) {
							System.out.println(day+"��");
							break;
						}else {
							System.out.println("�Ⱓ�� �´� ���ڸ� �������ּ���");
						}
					}
				}catch(InputMismatchException e) {
					System.out.println("���ڸ� �Է����ּ���");
					continue;
				}
				break;
			}
		}	
				
}
