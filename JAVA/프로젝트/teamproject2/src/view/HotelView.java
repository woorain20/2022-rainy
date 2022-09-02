package view;

import java.util.Scanner;

import operate.Receipt;
import roomif.Room;
import controller.CaseOnePrint;
import dto.HotelVO;
import operate.Booknumber;

public class HotelView {
	
	private Scanner sc=new Scanner(System.in);
	HotelVO hotelVO=new HotelVO();
	int n;
	
	public void Reservation() {
		
		//���� ȭ��
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to NWJ Hotel");
		System.out.println("������ �̸��� �Է����ּ���.");
		String name=sc.nextLine();
		System.out.println("�����ڸ�: "+name);
		System.out.println("����ó(-���� �Է����ּ���.)");	
		int phoneN=sc.nextInt();	
		System.out.println("����ó: "+phoneN);
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
			ViewRoom vr=new ViewRoom();
			ViewNight vn=new ViewNight();
			ViewCheckIn vc=new ViewCheckIn();
			Booknumber bn=new Booknumber();
			vr.Room();
			vn.Night();
			vc.CheckIn();
			System.out.println("�����ȣ: "+bn.bookNumber());
			System.out.println();
			hotelVO.setBooknumber(bn.bookNumber());
			
			while(true) {
				System.out.println("������ �����ϰڽ��ϱ�?");
				System.out.println("1. Yes || 2. No");
				int answer=sc.nextInt();
				
				if(answer==1) {
					Receipt ro= new Receipt();
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
		HotelView hv=new HotelView();
		hv.Reservation();
	}
}
