package chapter12;

import java.util.Scanner;

public class ScannerBug {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//정수 입력
		System.out.print("정수 입력: ");
		int num1=scanner.nextInt();
		//문자열 입력
		System.out.print("문자열 입력: ");
		String str1=scanner.nextLine();
		//콘솔 출력
		System.out.println("입력받은 정수: "+num1+"\n"+"입력받은 문자열: "+str1);
		
		//버그 원인=주석
		//버그 해결책
		//작동 잘 되게
	}

}
