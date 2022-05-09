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
	
	public void makeReservation() {
		int manu;
		while(true) {
			manu=hotelView.ReservationManu();
			HotelVO hotelVO=new HotelVO();
			//main loop
			switch(manu){
				case 1:
					//예약 실행
					hotelView.ReservationStart();
					hotelVO.setName(hotelView.name);
					hotelVO.setPhoneNum(hotelView.phoneN);
					hotelView.roomChice();
					hotelVO.setRoom(hotelView.room);
					hotelView.Checkinday();
					hotelVO.setYear(hotelView.year);
					hotelVO.setMonth(hotelView.month);
					hotelVO.setDay(hotelView.day);
					hotelView.night();
					hotelVO.setNight(hotelView.night);
					hotelVO.setBooknumber(Booknumber.bookNumber());
					hotelVO.setCost(CostChange.tocost);
					
					mng.createRervation(hotelVO);
					rec.Room(hotelVO);
					break;
					
				case 2:
					//예약 조회
					hotelView.reservationCheck();
					mng.getReservation(hotelView.book);
					hotelVO.print();
					break;
					
				case 3:
					//예약 수정
					hotelView.reservationUpdate();
					hotelView.roomChice();
					hotelView.night();
					hotelView.Checkinday();
					hotelVO.setBooknumber(hotelView.book);
					hotelVO.setRoom(hotelView.room);
					hotelVO.setNight(hotelView.night);
					hotelVO.setYear(hotelView.year);
					hotelVO.setMonth(hotelView.month);
					hotelVO.setDay(hotelView.day);
					hotelVO.setCost(CostChange.tocost);
					
					mng.createRervation(hotelVO);
					rec.Room(hotelVO);
					break;
				
				case 4:
					hotelView.reserveCancel();
					mng.deleteReservation(hotelVO);
					break;
					
				case 5:
					System.out.println("이용해주셔서 감사합니다.");
					System.out.println();
					System.out.println("\t종료");
					return;
			}
		}
	}
	



}
