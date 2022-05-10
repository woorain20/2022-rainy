package controller;

import dto.HotelVO;
import operate.Booknumber;
import operate.CostChange;
import operate.Receipt;
import operate.ViewRoom;
import service.Management;
import view.HotelView;

public class ReservationCon {
	HotelView hotelView=new HotelView();	
	Management mng=new Management();
	Receipt rec=new Receipt();
	CostChange cc=new CostChange();
	
	public void makeReservation() {
		int manu;
		while(true) {
			manu=hotelView.ReservationManu();
			HotelVO hotelVO=new HotelVO();
			//main loop
			switch(manu){
				case 1:
					//���� ����
					hotelView.ReservationStart();
					hotelVO.setName(hotelView.name);
					hotelVO.setPhoneNum(hotelView.phoneN);
					hotelView.roomChice();
					hotelVO.setRoom(ViewRoom.room);
					hotelView.Checkinday();
					hotelVO.setYear(hotelView.year);
					hotelVO.setMonth(hotelView.month);
					hotelVO.setDay(hotelView.day);
					hotelView.night();
					hotelVO.setNight(hotelView.night);
					hotelVO.setBooknumber(Booknumber.bookNumber());
					cc.totalCost(hotelVO);
					hotelVO.setCost(CostChange.totalCost);
					
					mng.createRervation(hotelVO);
					rec.Room(hotelVO);
					break;
					
				case 2:
					//���� ��ȸ
					hotelView.reservationCheck();
					mng.getReservation(hotelView.book);
					hotelVO.print();
					break;
					
				case 3:
					//���� ����
					hotelView.reservationUpdate();
					hotelView.roomChice();
					hotelView.night();
					hotelView.Checkinday();
					hotelVO.setBooknumber(hotelView.book);
					hotelVO.setRoom(ViewRoom.room);
					hotelVO.setNight(hotelView.night);
					hotelVO.setYear(hotelView.year);
					hotelVO.setMonth(hotelView.month);
					hotelVO.setDay(hotelView.day);
					cc.totalCost(hotelVO);
					hotelVO.setCost(CostChange.totalCost);
					
					
					mng.createRervation(hotelVO);
					rec.Room(hotelVO);
					break;
				
				case 4:
					hotelView.reserveCancel();
					mng.deleteReservation(hotelVO);
					break;
					
				case 5:
					System.out.println("�̿����ּż� �����մϴ�.");
					System.out.println();
					System.out.println("\t����");
					return;
			}
		}
	}
	



}
