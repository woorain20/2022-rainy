package view;

import java.util.Scanner;

import operate.Receipt;
import roomIf.Room;
import controller.CaseOnePrint;
import dto.HotelVO;
import operate.Booknumber;

public class HotelView {
	
	private Scanner sc=new Scanner(System.in);
	
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
			CaseOnePrint cop=new CaseOnePrint();
			cop.OneReservation();
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
