import java.util.Scanner;

public class SuiteRoom {
	static Scanner sc = new Scanner(System.in);

	public static void Suite() {
			char exit = 0; //����üŷ�� ���� ���� 
		
		System.out.println("����Ʈ���Դϴ�. �̿��ο����� �Է����ּ���. �ִ� 2��");
	
		int peaple = 0;                 //�ν� peaple = �ο�
		peaple = sc.nextInt(); 
		while(peaple<3) {               //�ִ� 2�α���   0,1,2���� ��¹޴´�.
		System.out.println("�̿��μ��� "+peaple+"�� �Դϴ�.");
		peaple++;
		
		int cost = 120000;            //���� cost = ���
		System.out.println("����Ʈ���� �̿����� "+ cost + "���Դϴ�.");
		
		System.out.println("������ �Ͻðڽ��ϱ�?(y/n)");  
		exit = sc.next().charAt(0);
		
		if(exit == 'n' || exit == 'N') {// ���� üŷ
		System.out.println("������ ����Ͽ����ϴ�.");
		return ; }
		}	
}
	public static void main(String[] args) {
		Suite();                    //�޼ҵ� ȣ�Ⱚ
}
}