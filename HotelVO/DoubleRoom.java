import java.util.Scanner;
public class DoubleRoom {
	static Scanner sc = new Scanner(System.in);
	public static void Double() {
		
		char  exit = 0; //����üŷ�� ���� ����
		
		System.out.println("������Դϴ�. �̿��ο����� �Է����ּ���. �ִ� 2��");
		
	
		int peaple = 0;    
		peaple = sc.nextInt();
		while(peaple <= 3) {              //�ִ� 2�α���   0,1,2���� ��¹޴´�.
		System.out.println("�̿��μ��� "+peaple+"�� �Դϴ�.");;         //�ν� Peaple = �ο�
		peaple++;
		break;}
		
		int cost = 100000;         //���� cost = ���
		System.out.println("������� �̿����� "+ cost  + "���Դϴ�.");
		
		//�ο� , ������ ����� ���ݺ���.  
		
		System.out.println("������ �Ͻðڽ��ϱ�?(y/n)");   //���� ���� 
		exit = sc.next().charAt(0);
		
		if(exit == 'n' || exit == 'N') {// ���� üŷ
			System.out.println("������ ����Ͽ����ϴ�.");
			return ; }
		}



	public static void main(String[] args) {
		Double();                                  //�޼ҵ� ȣ�Ⱚ
}
}
