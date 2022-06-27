package passionjava015;

import java.util.Scanner;

public class ScanningKeyboard3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		
		System.out.print("버스번호: ");
		int num1=sc.nextInt();
		System.out.println("우진고속");
		System.out.println("박우진");
		System.out.println("시지-칠곡\n");
		
		System.out.print("버스번호: ");
		int num2=sc.nextInt();
		System.out.println("세진고속");
		System.out.println("김세진");
		System.out.println("명곡-영남대\n");
		
		System.out.print("버스번호: ");
		int num3=sc.nextInt();
		System.out.println("동일운수");
		System.out.println("정동일");
		System.out.println("반야월-화원\n");
	}

}
