package HotelDto;

import java.util.Scanner;

public class HotelView {
	
	private Scanner sc=new Scanner(System.in);
	
	int n;
	
	public void Reservation() {
		
		//���� ȭ��
		System.out.println("Welcome to NWJ Hotel");
		System.out.println();
		System.out.println("�Ʒ��� �׸� �� ���Ͻô� �׸��� ��ȣ�� �������ּ���");
		System.out.println("======================================================");
		System.out.println("1. ���� || 2. ������ȸ || 3. ���ຯ�� || 4. ������� || 5. ����");
		System.out.println("Reservation: ");
		System.out.println();
		
		n=sc.nextInt();
		
		switch(n) {
		
		case 1:
			System.out.println("������ �����ϼ̽��ϴ�.");
			//HotelReservation ��������
			HotelReservation hv=new HotelReservation();
			hv.Room();
			hv.Night();
			hv.CheckIn();
			break;
			
		case 2:
			System.out.println("������ȸ�� �����ϼ̽��ϴ�.");
			
			break;
			
		case 3:
			System.out.println("������ �����ϰڽ��ϴ�.");
			
			break;
			
		case 4:
			System.out.println("������ ����ϰڽ��ϴ�.");
			
			break;
			
		default:
			System.out.println("����");
		}	
		
	}
	public static void main(String[] args) {
		
		HotelView res=new HotelView();
		res.Reservation();
	}
}
