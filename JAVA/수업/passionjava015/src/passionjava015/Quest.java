package passionjava015;

import java.util.Scanner;

public class Quest {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		//���� �Է�
		System.out.print("���� �Է�: ");
		int num1=scanner.nextInt();
		//��ĳ�� ���� ���� ���׸� ���� ������ �ڵ�
		scanner.nextLine();
		//����+\n
		//���ڿ� �Է�
		System.out.println("���ڿ� �Է�: ");
		String str1=scanner.nextLine();
		//�ܼ� �Է�
		System.out.println("�Է¹��� ����: "+num1+"\n"+"�Է¹��� ���ڿ�: "+str1);
		
		/* ����: ��ĳ���� nextLine �޼ҵ�� ��ĳ���� ���� �޼ҵ�� ������ �ֿܼ� �Է��ϰ� �Ǹ� nextLine �޼ҵ带 ����� �� ���� ������ �߻��Ѵ�.
		 * ����: nextLine �޼ҵ�� ���� �޼ҵ�� ������� �޶� �����͸� �д� ������ ���� ������ �߻��Ѵ�.
		 * �ذ��� 1: nextLine �޼ҵ带 ���� �޼ҵ庸�� ���� ����Ѵ�.
		 * �ذ��� 2: ���� �޼ҵ� ������ nextLine �޼ҵ带 �߰��Ѵ�.
		 */
		
		
		
	}

}
