package example;


import java.time.DayOfWeek;
import java.time.LocalDate;


public class CostChange {
	//���� ���� ��ȯ 
		
	public static double cost=10000;  //�ӽ����� < ������ �ٸ� ������ ���������� �ϱ�

	//�ָ� �߰����	
	public static void weekendcost(LocalDate date) {
		DayOfWeek dayOfWeek=date.getDayOfWeek();
		int WeekNumber=dayOfWeek.getValue();
		if(WeekNumber==5||WeekNumber==6){
	 cost= cost*1.25;
		}
;
	}
	//������ �߰����
	
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
		LocalDate bookday=LocalDate.of(2024, 1, 1);//<������ ���� �ϱ�<-������ �����
		bookday=bookday.plusDays(i);
		weekendcost(bookday);
		vacation(bookday);
		cost+=cost;
		}
		System.out.println("������ : "+(int) cost+"��");
		return cost;
	}

	public static void main(String[] args) {  //���� ���� �ٸ����ؼ� �Ѿ���� ����
		totalCost();
		
	}
	
	
}


