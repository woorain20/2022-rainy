package controller;

import java.util.Scanner;

import dto.HotelVO;
import operate.Booknumber;
import operate.Receipt;
import view.ViewCheckIn;
import view.ViewNight;
import view.ViewRoom;

public class CaseOnePrint {
	Scanner sc=new Scanner(System.in);
	HotelVO hotelVO=new HotelVO();
	
	public void OneReservation(){
		
		//HotelReservation 가져오기
		ViewRoom vr=new ViewRoom();
		ViewNight vn=new ViewNight();
		ViewCheckIn vc=new ViewCheckIn();
		Booknumber bn=new Booknumber();
		vr.Room();
		vn.Night();
		vc.CheckIn();
		System.out.println("예약번호: "+bn.bookNumber());
		System.out.println();
		hotelVO.setBooknumber(bn.bookNumber());
		
		while(true) {
			System.out.println("예약을 진행하겠습니까?");
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
				System.out.println("예약을 종료합니다.");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("다시 입력해주세요.");
			}
		}
	}
}
