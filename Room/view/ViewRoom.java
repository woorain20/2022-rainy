package view;



import java.util.Scanner;

import dto.HotelVO;
import roomif.Room;


public class ViewRoom {
	Scanner sc=new Scanner(System.in);

	
	public String room;
	//���� ����
	public void Room() {
		HotelVO hotelVO=new HotelVO();
		while(true) {
			System.out.println();
			System.out.println("�Ʒ��� �� �� ���Ͻô� ���� �������ּ���");
			System.out.println("=============================");
			System.out.println("�̱� || ���� || Ʈ�� || ����Ʈ");
			System.out.print("Room: ");
			room=sc.nextLine();
			Room sr=new Room();
		
			if(room.equals("�̱�")) {
				System.out.println("�̱۷��� �����ϼ̽��ϴ�.");
				sr.single();
				break;
			}else if(room.equals("����")) {
				System.out.println("�������� �����ϼ̽��ϴ�.");
				sr.Double();
				break;
			}else if(room.equals("Ʈ��")) {
				System.out.println("Ʈ������ �����ϼ̽��ϴ�.");
				sr.Twin();
				break;
			}else if(room.equals("����Ʈ")) {
				System.out.println("����Ʈ���� �����ϼ̽��ϴ�.");
				sr.Suite();
				break;
			}else {
				System.out.println("�߸� �����ϼ̽��ϴ�.");
				System.out.println("�ٽ� �Է����ּ���.");
			}
			hotelVO.setRoom(room);
		}
		System.out.println();
	}
			

}