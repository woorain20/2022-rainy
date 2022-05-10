package view;


import java.util.InputMismatchException;
import java.util.Scanner;
import dto.HotelVO;
import operate.Booknumber;
import operate.Receipt;
import operate.ViewCheckIn;
import operate.ViewNight;
import operate.ViewRoom;
import service.Management;


public class HotelView {
	
	public String name;
	public String phoneN;
	private HotelVO hotelVO=new HotelVO();
	private Scanner sc=new Scanner(System.in);
	
	Management mng=new Management();
	Receipt rec=new Receipt();
	ViewRoom vr=new ViewRoom();
	ViewNight vn=new ViewNight();
	ViewCheckIn vc=new ViewCheckIn();
	Booknumber bn=new Booknumber();
	public int room;
	public int night;
	public int year;
	public int month;
	public int day;
	public String book;

	
	public int ReservationManu() {
		System.out.println("Welcome to �ڹ� Hotel");
		System.out.println();
		System.out.println("�Ʒ��� �׸� �� ���Ͻô� �׸��� ��ȣ�� �������ּ���");
		System.out.println("======================================================");
		System.out.println("1. ���� || 2. ������ȸ || 3. ���ຯ�� || 4. ������� || 5. ����");
		System.out.print("Reservation: ");
		System.out.println();
		int choice=-1;
		try {
			choice=sc.nextInt();
			sc.nextLine();
		}catch(InputMismatchException e) {
			sc.nextLine();
			System.out.println("������ ���ڸ� �Է��ϼ���.");
		}return choice;
	}
	public void ReservationStart() {
		System.out.println("������ �����ϰڽ��ϴ�.");
		System.out.println("������ �̸��� �Է����ּ���.");
		name=sc.nextLine();
		System.out.println("�����ڸ�: "+name);
		System.out.println("����ó(-���� �Է����ּ���.)");	
		phoneN=sc.nextLine();
		System.out.println("����ó: "+phoneN);
	}
	public void roomChice() {
		//HotelReservation ��������// �� ���ڷ� ��ȯ
		System.out.println();
		System.out.println("�Ʒ��� �� �� ���Ͻô� ���� ��ȣ�� �������ּ���");
		System.out.println("1.�̱� || 2.���� || 3.Ʈ�� || 4.����Ʈ");
		room=sc.nextInt();
		System.out.print("���� ��: "+room+"��");
		vr.Room(room);
	}
		
	public void Checkinday() {
		System.out.println();			
		System.out.println("Check-in ��¥�� �������ּ���");
		System.out.println("�Խ� ������ ������ �ּ��� ");
		vc.CheckInYear(year=sc.nextInt());
		vc.CheckInMonth(month=sc.nextInt());
		vc.CheckInDay(day=sc.nextInt());
	}
	public void night() {	
		System.out.println("���ڱⰣ�� �������ּ���");
		System.out.println("date: ");
		vn.Night(night=sc.nextInt());
	}
	public String reservationCheck() {
		//������ȸ
		System.out.println("���� ��ȸ");
		System.out.println();
		System.out.println("�����ȣ�� �Է����ּ���");
		book=sc.nextLine();
		System.out.println("�����ȣ: "+book);
		return book;
	}
	
	public String reservationUpdate() {
		//���� ����
		System.out.println("���� ����");
		System.out.println();
		System.out.println("�����ȣ�� �Է����ּ���");
		book=sc.nextLine();
		System.out.println("�����ȣ: "+book);	
		return book;	
	}

	public String reserveCancel() {
		System.out.println("���� ���");
		System.out.println();
		System.out.println("�����ȣ�� �Է����ּ���");
		book=sc.nextLine();
		System.out.println("�����ȣ: "+book);	
		return book;
	}
	
}