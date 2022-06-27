package passionjava015;

import java.util.Scanner;

public class ScanningKeyboard2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num1=sc.nextInt();
		System.out.print("정수 입력: ");
		int num2=sc.nextInt();
		System.out.print("정수 입력: ");
		int num3=sc.nextInt();
		
		System.out.println(num1+"+"+num2+"+"+num3+"="+(num1+num2+num3));
	}

}
