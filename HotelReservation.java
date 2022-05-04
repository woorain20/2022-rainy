package HotelDto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HotelReservation{
	private Scanner sc=new Scanner(System.in);
	
	//���� ����
	public void Room() {
		
		while(true) {
			System.out.println();
			System.out.println("�Ʒ��� �� �� ���Ͻô� ���� �������ּ���");
			System.out.println("=============================");
			System.out.println("�̱� || ���� || Ʈ�� || ����Ʈ");
			System.out.print("Room: ");
			String room=sc.nextLine();
		
			if(room.equals("�̱�")) {
				System.out.println("�̱۷��� �����ϼ̽��ϴ�.");
				break;
			}else if(room.equals("����")) {
				System.out.println("������� �����ϼ̽��ϴ�.");
				break;
			}else if(room.equals("Ʈ��")) {
				System.out.println("Ʈ������ �����ϼ̽��ϴ�.");
				break;
			}else if(room.equals("����Ʈ")) {
				System.out.println("����Ʈ���� �����ϼ̽��ϴ�.");
				break;
			}else {
				System.out.println("�߸� �����ϼ̽��ϴ�.");
				System.out.println("�ٽ� �Է����ּ���.");
			}
		}
		System.out.println();
	}	
	
	//���ڱⰣ
	public int Night() {
		
		while(true) {
			System.out.println("���ڱⰣ�� �������ּ���");
			System.out.println("date: ");
			//���ڿ� ����ó��
			int night=0;
			try {
				night=sc.nextInt();
				sc.nextLine();
				System.out.println(night+"�� "+(night+1)+"���� �����ϼ̽��ϴ�.");
				return night;
			}catch(InputMismatchException e) {
				sc.nextLine();
				System.out.println("���ڸ� �Է����ּ���");
			}
			System.out.println();
		}	
	}
	
	//üũ�� ��¥
	public void CheckIn() {
		System.out.println("Check-in ��¥�� �������ּ���");
		System.out.println("Start: ");
		System.out.println("�⵵�� �������ּ���");
		//���ڿ� ����ó��
		int year=0;
		try {
			year=sc.nextInt();
			sc.nextLine();
			System.out.println(year+"��");			
		}catch(InputMismatchException e) {
			sc.nextLine();
			System.out.println("���ڸ� �Է����ּ���");
		}
		System.out.println("���� �������ּ���");
		//���ڿ� ����ó��
		int month=0;
		try {
			month=sc.nextInt();
			sc.nextLine();
			System.out.println(month+"��");
		}catch(InputMismatchException e) {
			sc.nextLine();
			System.out.println("���ڸ� �Է����ּ���");
		}
		System.out.println("���� �������ּ���");
		//���ڿ� ����ó��
		int day=0;
		try {
			day=sc.nextInt();
			sc.nextLine();
		}catch(InputMismatchException e) {
			sc.nextLine();
			System.out.println("���ڸ� �Է����ּ���");			
		}
		System.out.println(day+"��");
		sc.nextLine();
		System.out.println(year+"�� "+month+"�� "+day+"��"+"�� �����ϼ̽��ϴ�.");
	}
	
	//����
	public static void main(String[] args) {
		HotelReservation hr=new HotelReservation();
		hr.Room();
		hr.Night();
		hr.CheckIn();

	}
	
	

	
	
}
