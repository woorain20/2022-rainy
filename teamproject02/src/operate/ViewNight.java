package operate;

import java.util.InputMismatchException;
import java.util.Scanner;

import dto.HotelVO;

public class ViewNight {
	private Scanner sc=new Scanner(System.in);
	HotelVO hotelVO=new HotelVO();
	
	//���ڱⰣ
	public int night=0;
		public int Night() {
			while(true) {
				System.out.println();
				System.out.println("���ڱⰣ�� �������ּ���");
				System.out.println("date: ");
				//���ڿ� ����ó��
				try {
					night=sc.nextInt();
					sc.nextLine();
					System.out.println(night+"�� "+(night+1)+"���� �����ϼ̽��ϴ�.");
					return night;
				}catch(InputMismatchException e) {
					sc.nextLine();
					System.out.println("���ڸ� �Է����ּ���");
				}
				hotelVO.setNight(night);
				System.out.println();
			}
			
		}

}
