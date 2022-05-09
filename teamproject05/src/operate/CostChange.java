package operate;


import java.time.DayOfWeek;
import java.time.LocalDate;

import dto.HotelVO;


public class CostChange {
	
	;
	//���� ���� ��ȯ 
	
	public double cost;  
	public static double tocost;

	//�ָ� �߰����	
	public void weekendcost(LocalDate date) {
		DayOfWeek dayOfWeek=date.getDayOfWeek();
		int WeekNumber=dayOfWeek.getValue();
		if(WeekNumber==5||WeekNumber==6){
	 cost= cost*1.25;
		}

	}
	//������ �߰����
	
	public void vacation(LocalDate date) {
				
		if(date.getMonthValue()==7||date.getMonthValue()==12) {			
			if(date.getDayOfMonth()>14) {
				cost=cost*1.5;
			}
		}else if(date.getMonthValue()==8 || date.getMonthValue()==9 ||date.getMonthValue()==1||date.getMonthValue()==2){
			cost=cost*1.5;
		}
		
	}

	
	public double totalCost(HotelVO hotelVO) {
			
		for(int i=0; i<hotelVO.getNight();i++) {

			if(hotelVO.getRoom()==1) {
				cost = 700000;           
			}else if(hotelVO.getRoom()==2) {
				cost = 100000;        
			}else if(hotelVO.getRoom()==3) {
				cost = 120000;           
			}else if(hotelVO.getRoom()==4) {
				cost = 300000;           
			}
			LocalDate bookday=LocalDate.of(hotelVO.getYear(), hotelVO.getMonth(), hotelVO.getDay());//<������ ���� �ϱ�
			bookday=bookday.plusDays(i);
			weekendcost(bookday);
			vacation(bookday);
			tocost+=cost;
			}
		return tocost;

		}

	
}
		
	

	
	
	



