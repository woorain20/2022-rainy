package passionjava015;

import java.util.Scanner;

public class ScanningKeyboard2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int num1=sc.nextInt();
		System.out.print("���� �Է�: ");
		int num2=sc.nextInt();
		System.out.print("���� �Է�: ");
		int num3=sc.nextInt();
		
		System.out.println(num1+"+"+num2+"+"+num3+"="+(num1+num2+num3));
	}

}
