package view;

import java.util.InputMismatchException;
import java.util.Scanner;

import dto.HotelVO;

public class ViewNight {
	private Scanner sc=new Scanner(System.in);
	HotelVO hotelVO=new HotelVO();
	
	//���ڱⰣ
		public int Night() {
			int nigth ;
			while(true) {
				System.out.println("���ڱⰣ�� �������ּ���");
				System.out.println("date: ");
				//���ڿ� ����ó��
//				int night=0;
				try {
					int night=sc.nextInt();
					sc.nextLine();
					System.out.println(night+"�� "+(night+1)+"���� �����ϼ̽��ϴ�.");
					return night;
				}catch(InputMismatchException e) {
					sc.nextLine();
					System.out.println("���ڸ� �Է����ּ���");
				}
				System.out.println();
			}
			
//			hotelVO.setNight(night);
//			hotelVO.print();
		}
		public static void main(String[] args) {
			ViewNight vn=new ViewNight();
			
		}
}
