package operate;

import java.time.LocalDate;
import java.util.InputMismatchException;




public class ViewCheckIn {

	LocalDate ld=LocalDate.now();
		//üũ�� ��¥
		public void CheckInYear(int year) {
			//�⵵ ���ڿ� ����ó��
			while(true) {			
				try {
					while(true) {
						//���� �ð����� ���� ��¥ ó�� �Ұ�
						if(ld.getYear()<=year){
							System.out.println(year+"��");		
							System.out.println("���� �������ּ���");
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
		}
		public void CheckInMonth(int month) {
			//�� ���ڿ� ����ó��
			while(true) {	
				try {
					while(true) {
						if(month<=12) {
							System.out.println(month+"��");
							System.out.println("���� �������ּ���");
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
		}
			
		public void CheckInDay(int day) {
			//�� ���ڿ� ����ó��
			while(true) {
				try {
	//				System.out.println("���� �������ּ���");
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
