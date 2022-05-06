package view;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

import dto.HotelVO;

public class ViewCheckIn {
	private Scanner sc=new Scanner(System.in);
	
		//üũ�� ��¥
		public void CheckIn() {
			
			int year=0;
			int month=0;
			int day=0;
			
			System.out.println("Check-in ��¥�� �������ּ���");
			System.out.println("Start: ");
			LocalDate ld=LocalDate.now();
			
			while(true) {			
				//�⵵ ���ڿ� ����ó��
				try {
					while(true) {
						System.out.println("�⵵�� �������ּ���");
						year=sc.nextInt();
						sc.nextLine();
						//���� �ð����� ���� ��¥ ó�� �Ұ�
						if(ld.getYear()<=year){
							System.out.println(year+"��");		
							break;
						}else {
							System.out.println("���ų�¥�� ������ �� �����ϴ�.");
						}
					}
				}catch(InputMismatchException e) {
					sc.nextLine();
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
						month=sc.nextInt();
						sc.nextLine();
						if(month<=12) {
							System.out.println(month+"��");
							break;
						}else {
							System.out.println("1~12�� �߿� �������ּ���.");
						}
					}
				}catch(InputMismatchException e) {
					sc.nextLine();
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
						day=sc.nextInt();
						sc.nextLine();
						if(day<=31) {
							System.out.println(day+"��");
							break;
						}else {
							System.out.println("�Ⱓ�� �´� ���ڸ� �������ּ���");
						}
					}
				}catch(InputMismatchException e) {
					sc.nextLine();
					System.out.println("���ڸ� �Է����ּ���");
					continue;
				}
				break;
			}
			System.out.println(year+""+month+""+day);
			HotelVO hotelVO=new HotelVO();
			hotelVO.setCheckIn(year,month,day);
	
		}
		public static void main(String[] args) {
			ViewCheckIn vci=new ViewCheckIn();
			vci.CheckIn();
		}
		
		
		
}
