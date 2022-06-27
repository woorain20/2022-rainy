package chapter12;

import java.util.Scanner;

public class ScanningKeyboard {
	public static void main(String[] args) {
		//정수 3개를 입력 받아서 더하는 프로그램
		Scanner sc=new Scanner(System.in);
//		Scanner sca=new Scanner(System.in);
		System.out.print("정수 입력:");
		int num1=sc.nextInt();
		System.out.print("정수 입력:");
		int num2=sc.nextInt();
		System.out.print("정수 입력:");
		int num3=sc.nextInt();
		System.out.println(num1+"+"+num2+"+"+num3+"="+(num1+num2+num3));
	}

}
