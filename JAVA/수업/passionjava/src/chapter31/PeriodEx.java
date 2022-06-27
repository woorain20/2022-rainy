package chapter31;

import java.time.LocalDate;
import java.time.Period;

public class PeriodEx {
	public static void main(String[] args) {
		//���ú��� ũ������������ ��ĥ?
		
		//����
		LocalDate today=LocalDate.now();
		System.out.println(today);
		
		//�� ���� ũ��������
		LocalDate xmas=LocalDate.of(today.getYear(), 12, 25);
		System.out.println(xmas);
		
		//Ư�� ���� ũ��������
		LocalDate xmas2=LocalDate.of(2024, 12, 25);
		System.out.println(xmas2);
		
		//ũ������������ ��ĥ?
		Period left=Period.between(today, xmas);
		Period left2=Period.between(today, xmas2);
		System.out.println(left.getMonths()+"��"+left.getDays()+"��");
		System.out.println(left2.getYears()+"��"+left2.getMonths()+"��"+left2.getDays()+"��");
	}
}
