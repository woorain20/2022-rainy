package View;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ViewNight {
	private Scanner sc=new Scanner(System.in);
	
	//���ڱⰣ
		public int Night() {
			
			while(true) {
				System.out.println("���ڱⰣ�� �������ּ���");
				System.out.println("date: ");
				//���ڿ� ����ó��
				int night=0;
				try {
					night=sc.nextInt();
					sc.nextLine();
					System.out.println(night+"�� "+(night+1)+"���� �����ϼ̽��ϴ�.");
					return night;
				}catch(InputMismatchException e) {
					sc.nextLine();
					System.out.println("���ڸ� �Է����ּ���");
				}
				System.out.println();
			}	
		}
		public static void main(String[] args) {
			ViewNight vn=new ViewNight();
			vn.Night();
		}
}
