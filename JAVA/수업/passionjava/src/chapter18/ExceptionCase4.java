package chapter18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCase4 {
	public static void main(String[] args) {
		
		System.out.println("������ ���α׷� ����");	
		//���ܰ� �߻� �Ǵ� ���� ���α׷� ������ ����
		Scanner scanner=new Scanner(System.in);
		System.out.println("������ ���α׷�");
		try {
			System.out.println("a/b...a?");
			int n1=scanner.nextInt();
			scanner.nextLine();
			System.out.println("a/b...b?");
			int n2=scanner.nextInt();
			System.out.println(n1+"/"+n2+"="+n1/n2);	
		}catch(Throwable e) {
//			System.out.println(e.getMessage());
			System.out.println("�߸� �Է��߽��ϴ�.");
		}
		System.out.println("������ ���α׷� ���� ����");
	}
}
