package example;


import java.time.DayOfWeek;
import java.time.LocalDate;


public class CostChange2 {
	//���� ���� ��ȯ 
		
	public static double cost=10000;  //�ӽ����� < ������ �ٸ� ������ ���������� �ϱ�
	public static double tocost=0;

	//�ָ� �߰����	
	public static void plusecost(LocalDate date) {
		DayOfWeek dayOfWeek=date.getDayOfWeek();
		int WeekNumber=dayOfWeek.getValue();
		if(WeekNumber==5||WeekNumber==6){
			cost= cost*1.25;
		}
		 if(date.getMonthValue()==7||date.getMonthValue()==12) {			
			 if(date.getDayOfMonth()>14) {
				 cost=cost*1.5;
			 }else {
				
			 }
		 }else if(date.getMonthValue()==8 || date.getMonthValue()==9 ||date.getMonthValue()==1||date.getMonthValue()==2){
			 cost=cost*1.5;
		 }else {
		
		 }

	}
	//������ �߰����
	

	public static double totalCost() {
		LocalDate bookday=LocalDate.of(2022, 5, 18);//<������ ���� �ϱ�<-������ �����
		for(int i=0; i<4;i++) {
		bookday=bookday.plusDays(i);
		plusecost(bookday);
			tocost+=cost;


		}
		return cost;
	}

	public static void main(String[] args) {  //���� ���� �ٸ����ؼ� �Ѿ���� ����
		totalCost();
		System.out.println("������ : "+(int) tocost+"��");
//		for(int n=0; n<2 ;n++) {
//			
//			System.out.println(n);
//		}
		
	}
	
	
}


