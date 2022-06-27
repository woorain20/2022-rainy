package passionjava021;

import java.time.LocalDate;
import java.time.Period;

public class LocalDateDemo2 {
	public static void main(String[] args) {
		//����
		LocalDate today=LocalDate.now();
		System.out.println(today+"\n");
		
		//���� ũ��������
		LocalDate xmas=LocalDate.of(today.getYear(), 12, 25);
		System.out.println(xmas+"\n");
		
		//ũ������������ ��ĥ?
		Period left=Period.between(today, xmas);
		System.out.println(left.getMonths()+"����"+left.getDays()+"��");

	}

}
