package view;


import java.util.Scanner;
import dto.HotelVO;
import operate.Booknumber;
import operate.CostChange;
import operate.Receipt;
import operate.ViewCheckIn;
import operate.ViewNight;
import operate.ViewRoom;
import service.Management2;


public class HotelView {
	
	public String name;
	public int phoneN=0;
	public HotelVO hotelVO=new HotelVO();
	Management2 mng=new Management2();
	
	public void Reservation() {
		Scanner sc=new Scanner(System.in);
		
		//���� ȭ��
		System.out.println("Welcome to �ڹ� Hotel");
		System.out.println();
		System.out.println("�Ʒ��� �׸� �� ���Ͻô� �׸��� ��ȣ�� �������ּ���");
		System.out.println("======================================================");
		System.out.println("1. ���� || 2. ������ȸ || 3. ���ຯ�� || 4. ������� || 5. ����");
		System.out.print("Reservation: ");
		System.out.println();
		
		
		int n=sc.nextInt();
		
		Receipt rec=new Receipt();
		ViewRoom vr=new ViewRoom();
		ViewNight vn=new ViewNight();
		ViewCheckIn vc=new ViewCheckIn();
		CostChange cc=new CostChange();
		Booknumber bn=new Booknumber();
		
		
		switch(n) {
		
		case 1:
			Scanner sc1=new Scanner(System.in);
			System.out.println("������ �����ϰڽ��ϴ�.");
			System.out.println("====================");
			System.out.println("������ �̸��� �Է����ּ���.");
			name=sc1.nextLine();
			System.out.println("�����ڸ�: "+name);
			System.out.println("����ó(-���� �Է����ּ���.)");	
			phoneN=sc1.nextInt();
			System.out.println("����ó: "+phoneN);
			System.out.println();
			//HotelReservation ��������
			vr.Room();
			vc.CheckIn();
			vn.Night();
			hotelVO.setName(name);
			hotelVO.setPhoneNum(phoneN);
			hotelVO.setBooknumber(bn.bookNumber());
			hotelVO.setRoom(vr.room);
			hotelVO.setNight(vn.night);
			hotelVO.setYear(vc.year);
			hotelVO.setMonth(vc.month);
			hotelVO.setDay(vc.day);
			cc.totalCost(hotelVO);
			hotelVO.setCost(cc.tocost);
			mng.createRervation(hotelVO);
			rec.Room(hotelVO);
			break;
			
		case 2:
			//������ȸ
			System.out.println("���� ��ȸ");
			System.out.println();
			System.out.println("�����ȣ�� �Է����ּ���");
			System.out.println("====================");
			String booknumber;
			booknumber=sc.nextLine();
			sc.nextLine();
			System.out.println("�����ȣ: "+booknumber);
			mng.readResrve();
			hotelVO.print();
//			rec.Room(hotelVO);
//			mng.getReservation(booknumber);
			
			break;
			
		case 3:
			//���� ����
//			HotelVO hotelVO2=new HotelVO();
			System.out.println("���� ����");
			System.out.println();
			System.out.println("�����ȣ�� �Է����ּ���");
			System.out.println("====================");
//			int booknumber;
//			booknumber=sc.nextInt();
//			System.out.println("�����ȣ: "+booknumber);
						
			System.out.print("���� ���� ����");
			vr.Room();
			vc.CheckIn();
			vn.Night();
			hotelVO.setRoom(vr.room);
			hotelVO.setNight(vn.night);
			hotelVO.setYear(vc.year);
			hotelVO.setMonth(vc.month);
			hotelVO.setDay(vc.day);
			mng.putResreve(hotelVO);
			hotelVO.print();
			break;
			
		case 4:
			System.out.println("���� ���");
			System.out.println();
			System.out.println("�����ȣ�� �Է����ּ���");
			System.out.println("====================");
			System.out.print("�����ȣ: ");
			break;
			
		default:
			System.out.println("�̿����ּż� �����մϴ�.");
			System.out.println();
			System.out.println("\t����");
		}	
		
	}
	
}
