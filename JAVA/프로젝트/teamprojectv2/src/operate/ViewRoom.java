package operate;

import java.util.Scanner;


public class ViewRoom {
	Scanner sc=new Scanner(System.in);

	
	public String room;
	//���� ����
	public void Room() {
		while(true) {
			System.out.println();
			System.out.println("�Ʒ��� �� �� ���Ͻô� ���� �������ּ���");
			System.out.println("=============================");
			System.out.println("�̱� || ���� || Ʈ�� || ����Ʈ");
			System.out.print("Room: ");
			room=sc.nextLine();
		
			if(room.equals("�̱�")) {
				System.out.println("�̱۷��� �����ϼ̽��ϴ�.");
				
				int cost = 700000;            //���� cost = ���
				System.out.println("�̱۷��� �̿����� "+ cost + "���Դϴ�."); 
				
				break;
			}else if(room.equals("����")) {
				System.out.println("������� �����ϼ̽��ϴ�.");
				
				int cost = 100000;         //���� cost = ���
				System.out.println("������� �̿����� "+ cost  + "���Դϴ�.");
				
				break;
			}else if(room.equals("Ʈ��")) {
				System.out.println("Ʈ������ �����ϼ̽��ϴ�.");
				
				int cost = 150000;           //���� cost = ���
				System.out.println("Ʈ������ �̿����� "+ cost + "���Դϴ�.");
				
				break;
			}else if(room.equals("����Ʈ")) {
				System.out.println("����Ʈ���� �����ϼ̽��ϴ�.");
				
				int cost = 300000;            //���� cost = ���
				System.out.println("����Ʈ���� �̿����� "+ cost + "���Դϴ�.");
				
				break;
			}else {
				System.out.println("�߸� �����ϼ̽��ϴ�.");
				System.out.println("�ٽ� �Է����ּ���.");
			}
		}
		System.out.println();
	}
			

}
