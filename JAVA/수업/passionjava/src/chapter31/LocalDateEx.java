package chapter31;

import java.time.LocalDate;

public class LocalDateEx {
	public static void main(String[] args) {
		//����
		LocalDate today=LocalDate.now();
		System.out.println(today);
		//Ư���� ��
//		String xmas1="2022-12-25";
		LocalDate xmas=LocalDate.of(2022, 12, 25);
		System.out.println(xmas);
		System.out.println(today.getYear()); 	//������ ������ �� ����
		System.out.println(today.getMonth());	//�޸� ������ �� ����
		System.out.println(today.getDayOfWeek());	//������ ������ �� ����
		//�̺�
		LocalDate eve=xmas.minusDays(1);	//���ϴ� ���ڸ� ����
		System.out.println(eve);
		
		//���ú��� 1�� - 100��
		LocalDate hundred=today.plusDays(100);
		System.out.println(hundred);
	}

}
