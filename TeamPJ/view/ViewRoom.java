package view;

import java.util.Scanner;

import roomIf.Room;

public class ViewRoom {
	private Scanner sc=new Scanner(System.in);
	
	//���� ����
	public void Room() {
		
		while(true) {
			System.out.println();
			System.out.println("�Ʒ��� �� �� ���Ͻô� ���� �������ּ���");
			System.out.println("=============================");
			System.out.println("�̱� || ���� || Ʈ�� || ����Ʈ");
			System.out.print("Room: ");
			String room=sc.nextLine();
		
			if(room.equals("�̱�")) {
				System.out.println("�̱۷��� �����ϼ̽��ϴ�.");
				Room sr=new Room();
				sr.single();
				break;
			}else if(room.equals("����")) {
				System.out.println("������� �����ϼ̽��ϴ�.");
				Room dr=new Room();
				dr.Double();
				break;
			}else if(room.equals("Ʈ��")) {
				System.out.println("Ʈ������ �����ϼ̽��ϴ�.");
				Room tr=new Room();
				tr.Twin();
				break;
			}else if(room.equals("����Ʈ")) {
				System.out.println("����Ʈ���� �����ϼ̽��ϴ�.");
				Room su=new Room();
				su.Suite();
				break;
			}else {
				System.out.println("�߸� �����ϼ̽��ϴ�.");
				System.out.println("�ٽ� �Է����ּ���.");
			}
		}
		System.out.println();
	}	
	public static void main(String[] args) {
		ViewRoom vr=new ViewRoom();
		vr.Room();
	}
}
