package passionjava015;

import java.util.Scanner;

public class BusInfo {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("���� ��ȣ: ");
		int num=sc.nextInt();
		if(num==724) {
			System.out.println("������: ĥ��");
			System.out.println("����: �Ӵ�װŸ�");
			System.out.println("�����ð�: 6��");
		}else {
			System.out.println("�߸��� ���� �����Դϴ�.");
		}
		int num2=sc.nextInt();
		if(num2==449) {
			System.out.println("������: ������");
			System.out.println("����: �߾ӷ�");
			System.out.println("�����ð�: 16��");
		}else {
			System.out.println("�߸��� ���� �����Դϴ�.");
		}
		int num3=sc.nextInt();
		if(num3==524) {
			System.out.println("������: ȭ��");
			System.out.println("����: �ϱ�û");
			System.out.println("�����ð�: 3��");
		}else {
			System.out.println("�߸��� ���� �����Դϴ�.");
		}
	}
}
