package view;


import java.util.Scanner;


import dto.HotelVO;
import operate.Booknumber;
import operate.CostChange;
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
		System.out.println();
		System.out.println("�Ʒ��� �׸� �� ���Ͻô� �׸��� ��ȣ�� �������ּ���");
		System.out.println("======================================================");
		System.out.println("1. ���� || 2. ������ȸ || 3. ���ຯ�� || 4. ������� || 5. ����");
		System.out.print("Reservation: ");
		System.out.println();
		
		
		int n;
		n=sc.nextInt();
		Receipt rec=new Receipt();
		
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
			ViewRoom vr=new ViewRoom();
			ViewNight vn=new ViewNight();
			ViewCheckIn vc=new ViewCheckIn();
			CostChange cc=new CostChange();
			Booknumber bn=new Booknumber();
			vr.Room();
			vn.Night();
			vc.CheckIn();
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
			System.out.println();
			System.out.println("�����ȣ�� �Է����ּ���");
			System.out.println("====================");
			System.out.print("�����ȣ: ");
			
		case 3:
			System.out.println("���� ����");
			System.out.println();
			System.out.println("�����ȣ�� �Է����ּ���");
			System.out.println("====================");
			System.out.print("�����ȣ: ");
			
		case 4:
			System.out.println("���� ���");
			System.out.println();
			System.out.println("�����ȣ�� �Է����ּ���");
			System.out.println("====================");
			System.out.print("�����ȣ: ");
			
		default:
			System.out.println("�̿����ּż� �����մϴ�.");
			System.out.println();
			System.out.println("\t����");
		}	
		
	}
	
}
