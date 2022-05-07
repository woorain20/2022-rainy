package view;


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
	public int phoneN=0;
	public HotelVO hotelVO=new HotelVO();
	
	public void Reservation() {
		Scanner sc=new Scanner(System.in);
		Management mng=new Management();
		
		//���� ȭ��
		System.out.println("Welcome to �ڹ� Hotel");
		System.out.println("������ �̸��� �Է����ּ���.");
		name=sc.nextLine();
		System.out.println("�����ڸ�: "+name);
		System.out.println("����ó(-���� �Է����ּ���.)");	
		phoneN=sc.nextInt();	
		System.out.println("����ó: "+phoneN);
		System.out.println();
		System.out.println("�Ʒ��� �׸� �� ���Ͻô� �׸��� ��ȣ�� �������ּ���");
		System.out.println("======================================================");
		System.out.println("1. ���� || 2. ������ȸ || 3. ���ຯ�� || 4. ������� || 5. ����");
		System.out.print("Reservation: ");
		System.out.println();
		
		hotelVO.setName(name);
		hotelVO.setPhoneNum(phoneN);
		
		int n;
		n=sc.nextInt();
		
		switch(n) {
		
		case 1:
			System.out.println("������ �����ϼ̽��ϴ�.");
			//HotelReservation ��������
			ViewRoom vr=new ViewRoom();
			ViewNight vn=new ViewNight();
			ViewCheckIn vc=new ViewCheckIn();
			Booknumber bn=new Booknumber();
			Receipt rec=new Receipt();
			vr.Room();
			vn.Night();
			vc.CheckIn();
			hotelVO.setBooknumber(bn.bookNumber());
			hotelVO.setRoom(vr.room);
			hotelVO.setNight(vn.night);
			hotelVO.setYear(vc.year);
			hotelVO.setMonth(vc.month);
			hotelVO.setDay(vc.day);
			mng.createRervation(hotelVO);
				
//			if() {
//				
//			}
			rec.Room(hotelVO);
			break;
			
		case 2:
			System.out.println("������ȸ�� �����ϼ̽��ϴ�.");
			mng.readResrve();
			break;
			
		case 3:
			System.out.println("������ �����ϰڽ��ϴ�.");
			mng.readResrve();
			break;
			
		case 4:
			System.out.println("������ ����ϰڽ��ϴ�.");
			break;
			
		default:
			System.out.println("����");
		}	
		
	}
	
}
