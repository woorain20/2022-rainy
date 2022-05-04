package servic;

import java.util.List;

import DTO.HotelVO;

public class Management {
	List<HotelVO> getHotelVOs() {
		return null;
	}
	
	public void makeReserve(String name, String room, String phone, String date){
		HotelVO hotelVO=new HotelVO();
		hotelVO.setName(name);
		hotelVO.setRoom(room);
		hotelVO.setPhoneNum(phone);
		hotelVO.setDate(date);  //예약 번호 생성 고민
		
		hotelVO.toString();
		//tostring 완성시키는 단계 > tostring의 구성요소 완성시키기 전 단계(tostring 한거 저장하는 방식으로 진행
		//5/4(수) 지금 예약번호, 
		

	}
	
	

}
