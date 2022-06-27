package chapter18;

import java.util.Scanner;

public class ExceptionCase2 {
	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");	
		//예외가 발생 되는 순간 프로그램 비정상 종료
		Scanner scanner=new Scanner(System.in);
		while(true) {
			try {
				System.out.println("a/b...a?");
				int n1=scanner.nextInt();
				System.out.println("a/b...b?");
				int n2=scanner.nextInt();
				System.out.println(n1+"/"+n2+"="+n1/n2);	
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
				System.out.println("0으로 나눌 수 없습니다.");
			}
		}
//		System.out.println("프로그램 정상 종료");
	}
}
