package roomif;

import java.util.Scanner;

public class TwinRoom {
	static Scanner sc = new Scanner(System.in);
	
	public static void Twin() {
		char exit = 0; //����üŷ�� ���� ���� 
		
		System.out.println("Ʈ�����Դϴ�. �̿��ο����� �Է����ּ���. �ִ� 4��");
		
		int peaple = 0;   
		peaple = sc.nextInt(); 
		while(peaple<5) {                 //�ִ� 2�α���   0,1,2,3,4���� ��¹޴´�.
		System.out.println("�̿��μ��� "+peaple+"�� �Դϴ�."); //�ν� Peaple = �ο�
		peaple++;
		break;}
		int cost = 150000;           //���� cost = ���
		System.out.println("Ʈ������ �̿����� "+ cost + "���Դϴ�.");
			
		System.out.println("������ �Ͻðڽ��ϱ�?(y/n)"); //���࿩��
		exit = sc.next().charAt(0);
		
		if(exit == 'n' || exit == 'N') { // ���� üŷ
		System.out.println("������ ����Ͽ����ϴ�.");
		return ; }
		}	
	
	public static void main(String[] args) {
		Twin();                          //�޼ҵ� ȣ�Ⱚ
}
}