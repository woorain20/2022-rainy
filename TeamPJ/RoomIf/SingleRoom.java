package roomif;

import java.util.Scanner;
public class SingleRoom {
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
		
	}
		
	}

	public static void main(String[] args) {
		single();                            //�޼ҵ� ȣ�Ⱚ
		
	}
	
	
}
