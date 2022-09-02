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
	}
}
