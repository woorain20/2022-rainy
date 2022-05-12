package operate;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;



public class ViewCheckIn {
	private Scanner sc=new Scanner(System.in);
	
	public int year=0;
	public int month=0;
	public int day=0;
		//üũ�� ��¥
		public void CheckIn() {
			System.out.println();			
			System.out.println("Check-in ��¥�� �������ּ���");
			System.out.println("Start: ");
			LocalDate ld=LocalDate.now();
			
			//�⵵ ���ڿ� ����ó��
			while(true) {			
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
		}
}
