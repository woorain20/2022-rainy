package controller;

import java.util.Scanner;

import dto.HotelVO;
import view.HotelView;
import view.ViewCheckIn;
import view.ViewNight;
import view.ViewRoom;

public class ResrevationController {
	Scanner sc=new Scanner(System.in);
	HotelView hv=new HotelView();
	ViewCheckIn vc=new ViewCheckIn();
	ViewRoom vr=new ViewRoom();
	ViewNight vn=new ViewNight();
	public void loop() {
		
								
// resrevation�� 1�Ͽ��� ���� ������ ���� How?
		hv.Reservation();  //->���� �ȸ޼ҵ� ������
		vr.Room();
		vn.Night();
		vc.CheckIn();
	
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ResrevationController con=new ResrevationController();
//		HotelVO hotelVO=new HotelVO();
//		hotelVO.setBooknumber(bookNumber());
//		hotelVO.print();
		System.out.println("������ �̸��� �Է����ּ���.");
		String name=sc.nextLine();
		System.out.println("�����ڸ�: "+name);
		System.out.println("����ó(-���� �Է����ּ���.)");	
		int phoneN=sc.nextInt();	
		con.loop();
		
		
	}

}
