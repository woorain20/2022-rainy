package test;

import java.util.Scanner;

import DTO.HotelVO;
import Marco.Booknumber;
import RoomIf.Rooms;
import RoomIf.SingleRoom;
import View.ViewCheckIn;
import View.ViewNight;

public class HotelView2 {
	
	private Scanner sc=new Scanner(System.in);
	
	int n;
	
	public void Reservation() {
		
		//���� ȭ��
		System.out.println();
		System.out.println("�Ʒ��� �׸� �� ���Ͻô� �׸��� ��ȣ�� �������ּ���");
		System.out.println("======================================================");
		System.out.println("1. ���� || 2. ������ȸ || 3. ���ຯ�� || 4. ������� || 5. ����");
		System.out.print("Reservation: ");
		System.out.println();
		
		n=sc.nextInt();
		
		switch(n) {
		
		case 1:
			System.out.println("������ �����ϼ̽��ϴ�.");
			//HotelReservation ��������
			ViewRoom2 vr=new ViewRoom2();
			ViewNight vn=new ViewNight();
			ViewCheckIn vc=new ViewCheckIn();
			Booknumber bn=new Booknumber();
			vr.Room();
			vn.Night();
			vc.CheckIn();
			System.out.println("�����ȣ: "+bn.bookNumber());
			System.out.println();
			
			while(true) {
				System.out.println("������ �����ϰڽ��ϱ�?");
				System.out.println("1. Yes || 2. No");
				int answer=sc.nextInt();
					
				if(answer==1) {
					Rooms ro= new Rooms();
					ro.Singleroom();
					ro.Doubleroom();
					ro.TwinRoom();
					ro.suiteroom();
					break;
				}else if(answer==2){
					System.out.println("������ �����մϴ�.");
					break;
				}else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					System.out.println("�ٽ� �Է����ּ���.");
				}
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
		System.out.println("Welcome to NWJ Hotel");
		System.out.println("������ �̸��� �Է����ּ���.");
		String name=sc.nextLine();
		System.out.println("�����ڸ�: "+name);
		System.out.println("����ó(-���� �Է����ּ���.)");	
		int phoneN=sc.nextInt();	
		System.out.println("����ó: "+phoneN);
		HotelView2 hv=new HotelView2();
		hv.Reservation();
	}
}
