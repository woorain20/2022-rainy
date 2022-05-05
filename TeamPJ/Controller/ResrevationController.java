package Controller;

import java.util.Scanner;

import DTO.HotelVO;
import View.HotelView;
import View.ViewCheckIn;
import View.ViewNight;
import View.ViewRoom;

public class ResrevationController {
	Scanner sc=new Scanner(System.in);
	HotelView hv=new HotelView();
	ViewCheckIn vc=new ViewCheckIn();
	ViewRoom vr=new ViewRoom();
	ViewNight vn=new ViewNight();
	public void loop() {
		
								
// resrevation의 1일에만 여기 오도록 선정 How?
		hv.Reservation();  //->여기 안메소드 진행중
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
		System.out.println("예약자 이름을 입력해주세요.");
		String name=sc.nextLine();
		System.out.println("예약자명: "+name);
		System.out.println("연락처(-없이 입력해주세요.)");	
		int phoneN=sc.nextInt();	
		con.loop();
		
		
	}

}
