package roomIf;

import java.util.Scanner;

public class Room {
	static Scanner sc = new Scanner(System.in);

	public static void single() {
		char exit = 0; //����üŷ�� ���� ���� 
		
		System.out.println("�̱۷��Դϴ�. �̿��ο����� �Է����ּ���. �ִ� 1��");
		
		int cost = 700000;            //���� cost = ���
		System.out.println("�̱۷��� �̿����� "+ cost + "���Դϴ�."); 
		
		
		System.out.println("������ �Ͻðڽ��ϱ�?(y/n)");   //���� ���� 
		exit = sc.next().charAt(0);
	
	    if(exit == 'n' || exit == 'N') {          // ���� üŷ
		System.out.println("������ ����Ͽ����ϴ�.");
		return ; }
	}
	
	public static void Double() {
		
		char  exit = 0; //����üŷ�� ���� ����
		
		System.out.println("�������Դϴ�. �̿��ο����� �Է����ּ���. �ִ� 2��");
		
		
		int cost = 100000;         //���� cost = ���
		System.out.println("�������� �̿����� "+ cost  + "���Դϴ�.");
		
		//�ο� , ������ ����� ���ݺ���.  
		
		System.out.println("������ �Ͻðڽ��ϱ�?(y/n)");   //���� ���� 
		exit = sc.next().charAt(0);
		
		if(exit == 'n' || exit == 'N') {// ���� üŷ
			System.out.println("������ ����Ͽ����ϴ�.");
			return ; }
		}
	
	public static void Twin() {
		char exit = 0; //����üŷ�� ���� ���� 
		
		System.out.println("Ʈ�����Դϴ�. �̿��ο����� �Է����ּ���. �ִ� 4��");
		
		
		int cost = 150000;           //���� cost = ���
		System.out.println("Ʈ������ �̿����� "+ cost + "���Դϴ�.");
			
		System.out.println("������ �Ͻðڽ��ϱ�?(y/n)"); //���࿩��
		exit = sc.next().charAt(0);
		
		if(exit == 'n' || exit == 'N') { // ���� üŷ
		System.out.println("������ ����Ͽ����ϴ�.");
		return ; }
		}	
	
	public static void Suite() {
		char exit = 0; //����üŷ�� ���� ���� 
	
	System.out.println("����Ʈ���Դϴ�. �̿��ο����� �Է����ּ���. �ִ� 2��");

	
	int cost = 120000;            //���� cost = ���
	System.out.println("����Ʈ���� �̿����� "+ cost + "���Դϴ�.");
	
	System.out.println("������ �Ͻðڽ��ϱ�?(y/n)");  
	exit = sc.next().charAt(0);
	
	if(exit == 'n' || exit == 'N') {// ���� üŷ
	System.out.println("������ ����Ͽ����ϴ�.");
	return ; }
	}	
		

	public static void main(String[] args) {
		single();                            //�޼ҵ� ȣ�Ⱚ
		Double();
		Twin();
		Suite();
		
	}
	
	
}