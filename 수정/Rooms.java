package RoomIf;

import java.util.Scanner;

public class Rooms {
	
	public static void Singleroom() {
		
		String room = "single Room";  // ���̸�
		int phoneNum = 0;    //����ȣ<--view���� ��������
		int date = 0;       //�̿�Ⱓ
		String name = "";  //�̸� 
		int cost = 70000; //���

		    System.out.println(" ");
			System.out.println("\t\t ������������ �ҷ��帮�ڽ��ϴ�.\t");;
			System.out.println("������ : "+name);
			System.out.println("����ó : "+phoneNum);
			System.out.println("���� ��ǰ : "+room);
			System.out.println("�̿�Ⱓ : "+date);
			System.out.println("�⺻��� : "+cost);
			System.out.println("�� 1|ħ�� 1|��� 1|�ٴٺ�");
			System.out.println("���� : ���� | �̴Ϲ� ");
			System.out.println("\t\t �̿� ����帳�ϴ�. \t");
		
}
		
	public static void Doubleroom() {
		String room = "Double Room";  // ���̸�
		int phoneNum = 0;    //����ȣ<--view���� ��������
		int date = 0;       //�̿�Ⱓ
		String name = "";  //�̸� 
		int cost = 100000; //���

		    System.out.println(" ");
			System.out.println("\t\t ������������ �ҷ��帮�ڽ��ϴ�.\t");
			System.out.println("������ : "+name);
			System.out.println("����ó : "+phoneNum);
			System.out.println("���� ��ǰ : "+room);
			System.out.println("�̿�Ⱓ : "+date);
			System.out.println("�⺻��� : "+cost);
			System.out.println("�ִ��ο� : 2");
			System.out.println("�� 1|ħ�� 2|��� 1|�ٴٺ�");
			System.out.println("���� : ���� | �̴Ϲ�");
			System.out.println("\t\t �̿� ����帳�ϴ�. \t");
			
}
	public static void TwinRoom() {
		String room = "Twin Room";  // ���̸�
		int phoneNum = 0;    //����ȣ<--view���� ��������
		int date = 0;       //�̿�Ⱓ
		String name = "";  //�̸� 
		int cost = 100000; //���

		    System.out.println(" ");
			System.out.println("\t\t ������������ �ҷ��帮�ڽ��ϴ�.\t");
			System.out.println("������ : "+name);
			System.out.println("����ó : "+phoneNum);
			System.out.println("���� ��ǰ : "+room);
			System.out.println("�̿�Ⱓ : "+date);
			System.out.println("�⺻��� : "+cost);
			System.out.println("�ִ��ο� : 2");
			System.out.println("�� 2|ħ�� 2|��� 1|����ƾ��");
			System.out.println("���� : ���� | �̴Ϲ�");
			System.out.println("\t\t �̿� ����帳�ϴ�. \t");
			
		
	}			
			public static void suiteroom() {
				String room = "Suite Room";  // ���̸�
				int phoneNum = 0;    //����ȣ<--view���� ��������
				int date = 0;       //�̿�Ⱓ
				String name = "";  //�̸� 
				int cost = 200000; //���

					System.out.println(" ");
					System.out.println("\t\t ������������ �ҷ��帮�ڽ��ϴ�.\t");
					System.out.println("������ : "+name);
					System.out.println("����ó : "+phoneNum);
					System.out.println("���� ��ǰ : "+room);
					System.out.println("�̿�Ⱓ : "+date);
					System.out.println("�⺻��� : "+cost);
					System.out.println("�ִ��ο� : 4");
					System.out.println("�� 2|ħ�� 4|��� 2|����ƾ��");
					System.out.println("���� : ���� | �̴Ϲ� | �ｺ��");
					System.out.println("\t\t �̿� ����帳�ϴ�. \t");

			}
		public static void main(String[] args) {
			Singleroom();
			Doubleroom();
			TwinRoom();
			suiteroom();
			
					
}
		
}