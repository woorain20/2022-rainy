package example;


import java.time.DayOfWeek;
import java.time.LocalDate;


public class CostChange {
	//요일 숫자 변환 
		
	public static double cost=10000;  //임시지정 < 가격은 다른 곳에서 가져오도록 하기

	//주말 추가요금	
	public static void weekendcost(LocalDate date) {
		DayOfWeek dayOfWeek=date.getDayOfWeek();
		int WeekNumber=dayOfWeek.getValue();
		if(WeekNumber==5||WeekNumber==6){
	 cost= cost*1.25;
		}
;
	}
	//성수기 추가요금
	
	public static void vacation(LocalDate date) {
				
		if(date.getMonthValue()==7||date.getMonthValue()==12) {			
			if(date.getDayOfMonth()>14) {
				cost=cost*1.5;
			}
		}else if(date.getMonthValue()==8 || date.getMonthValue()==9 ||date.getMonthValue()==1||date.getMonthValue()==2){
			cost=cost*1.5;
		}
		
	}
	public static double totalCost() {
		for(int i=0; i<1;i++) {
		double cost=0;
		LocalDate bookday=LocalDate.of(2024, 1, 1);//<예약일 들어가게 하기<-성수기 비수기
		bookday=bookday.plusDays(i);
		weekendcost(bookday);
		vacation(bookday);
		cost+=cost;
		}
		System.out.println("결제금 : "+(int) cost+"원");
		return cost;
	}

	public static void main(String[] args) {  //메일 말고 다른거해서 넘어가도록 지정
		totalCost();
		
	}
	
	
}


