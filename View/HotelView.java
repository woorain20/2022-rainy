package View;

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
			ViewRoom vr=new ViewRoom();
			ViewNight vn=new ViewNight();
			ViewCheckIn vc=new ViewCheckIn();
			vr.Room();
			vn.Night();
			vc.CheckIn();
			System.out.println("������ �����ϰڽ��ϱ�?");
			System.out.println("True || False");
			boolean no=sc.nextBoolean();
			if(no=false) {
				return;
			}
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
		Scanner sc=new Scanner(System.in);
		System.out.println("������ �̸��� �Է����ּ���.");
		String name=sc.nextLine();
		System.out.println("�����ڸ�: "+name);
		System.out.println("����ó(-���� �Է����ּ���.)");	
		int phoneN=sc.nextInt();	
		HotelView hv=new HotelView();
		hv.Reservation();
	}
}
