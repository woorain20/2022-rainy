package oprate;


import java.time.DayOfWeek;
import java.time.LocalDate;




public class CostChange {
	//���� ���� ��ȯ 
	private LocalDate today=LocalDate.of(2022, 8, 05);  //��¥�� ������ �ֱ�
	private DayOfWeek dayOfWeek=today.getDayOfWeek();
	private int WeekNumber=dayOfWeek.getValue();
		
	public static double cost = 100000;  //�ӽ����� < ������ �ٸ� ������ ���������� �ϱ�

	 //�ָ��߰� ���	
	public int weekendcost() {
		if(WeekNumber==5||WeekNumber==6){
	 cost= cost*1.25;
		}
		return (int) cost;
	}
	//������ �߰����
	
	public int vacation(LocalDate date) {
				
		if(date.getMonthValue()==7||date.getMonthValue()==12) {			
			if(date.getDayOfMonth()>14) {
				cost=cost*1.5;
			}
		}else if(date.getMonthValue()==8 || date.getMonthValue()==9 ||date.getMonthValue()==1||date.getMonthValue()==2){
			cost=cost*1.5;
		}return (int) cost;
		
	}

	public static void main(String[] args) {  //���� ���� �ٸ����ؼ� �Ѿ���� ����
	CostChange cc=new CostChange();
	LocalDate bookday=LocalDate.of(22, 8, 06);//<������ ���� �ϱ�
	System.out.println(cc.WeekNumber);
	System.out.println(cc.today);
	
	
	cc.weekendcost();
	cc.vacation(bookday);
	System.out.println("������ : "+(int) cost+"��");
	
	}
	
	
}


