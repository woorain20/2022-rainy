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
		hotelVO.setDate(date);  //���� ��ȣ ���� ���
		
		hotelVO.toString();
		//tostring �ϼ���Ű�� �ܰ� > tostring�� ������� �ϼ���Ű�� �� �ܰ�(tostring �Ѱ� �����ϴ� ������� ����
		//5/4(��) ���� �����ȣ, 
		

	}
	
	

}
