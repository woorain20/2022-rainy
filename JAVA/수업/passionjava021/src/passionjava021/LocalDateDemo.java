package passionjava021;

import java.time.LocalDate;

public class LocalDateDemo {
	public static void main(String[] args) {
		//����
		LocalDate today=LocalDate.now();
		System.out.println(today+"\n");
		
		//���� ũ��������
		LocalDate xmas=LocalDate.of(today.getYear(), 12, 25);
		System.out.println(xmas+"\n");
		
		//���� ũ�������� �̺�
		LocalDate eve=xmas.minusDays(1);
		System.out.println(eve);
	}

}
